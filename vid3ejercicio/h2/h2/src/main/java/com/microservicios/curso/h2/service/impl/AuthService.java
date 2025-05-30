package com.microservicios.curso.h2.service.impl;

import com.microservicios.curso.h2.dto.LoginRequest;
import com.microservicios.curso.h2.model.Customer;
import com.microservicios.curso.h2.repository.CustomerRepository;
import com.microservicios.curso.h2.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AuthService implements IAuthService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ResponseEntity<?> login(LoginRequest request) {
        Optional<Customer> customerOpt = customerRepository.findByCustomerNumberAndPassword(
                request.getCustomerNumber(), request.getPassword());

        if (customerOpt.isPresent()) {
            Customer customer = customerOpt.get();

            // Verificar si ya existe una sesión activa
            if (customer.getSesion() != null && customer.getSesion()) {
                return new ResponseEntity<>("Ya hay una sesión activa para este usuario", HttpStatus.FORBIDDEN);
            }

            // Verificar si el usuario está autorizado (columna STATUS)
            if ("A".equals(customer.getStatus())) {
                customer.setSesion(true); // Establecer SESION como true
                customerRepository.save(customer); // Guardar el estado actualizado

                String token = UUID.randomUUID().toString(); // Generar un token de sesión

                HttpHeaders headers = new HttpHeaders();
                headers.add("Authorization", token); // Corregir typo "autorization" -> "Authorization"

                return new ResponseEntity<>(headers, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Usuario no autorizado", HttpStatus.UNAUTHORIZED);
            }
        }

        return new ResponseEntity<>("Credenciales inválidas", HttpStatus.UNAUTHORIZED);
    }
}

