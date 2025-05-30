package com.microservicios.curso.h2.controller;

import com.microservicios.curso.h2.model.Customer;
import com.microservicios.curso.h2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers(@RequestParam (name = "status", required = false) String status){

        if(Objects.nonNull(status)){
            return customerRepository.findByStatus(status);
        }
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{customerNumber}")
    public Customer getCustomer(@PathVariable("customerNumber") String customerNumber)
            throws Exception {
        return customerRepository.findById(customerNumber)
                .orElseThrow(() -> new Exception("Customer not found"));
    }



}
