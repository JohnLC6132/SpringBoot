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

            if ("A".equals(customer.getStatus())) {
                customer.setSesion(true);
                customerRepository.save(customer);

                String token = UUID.randomUUID().toString();

                HttpHeaders headers = new HttpHeaders();
                headers.add("autorization", token);

                return new ResponseEntity<>(headers, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Usuario no autorizado", HttpStatus.UNAUTHORIZED);
            }
        }

        return new ResponseEntity<>("Credenciales inválidas", HttpStatus.UNAUTHORIZED);
    }
}
