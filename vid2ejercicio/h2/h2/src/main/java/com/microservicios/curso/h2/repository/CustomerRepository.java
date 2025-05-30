package com.microservicios.curso.h2.repository;

import com.microservicios.curso.h2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Optional<Customer> findByCustomerNumberAndPassword(String customerNumber, String password);
}

