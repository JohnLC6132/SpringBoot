package com.microservicios.curso.h2.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountId implements Serializable {
    private String customerNumber;
    private String accountNumber;
}
