package com.microservicios.curso.h2.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CardId implements Serializable {
    private String accountNumber;
    private String cardNumber;

}
