package com.microservicios.curso.h2.repository;

import com.microservicios.curso.h2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String>{

    //List<Customer> findByStatusAndCreation(String status, String creation);
    List<Customer> findByStatus(String status);
}
