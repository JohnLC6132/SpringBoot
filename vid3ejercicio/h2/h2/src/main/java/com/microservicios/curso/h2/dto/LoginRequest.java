package com.microservicios.curso.h2.dto;

public class LoginRequest {
    private String customerNumber;
    private String password;

    // Getters y Setters
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
