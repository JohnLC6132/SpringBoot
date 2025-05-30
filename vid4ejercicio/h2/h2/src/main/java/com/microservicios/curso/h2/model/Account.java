package com.microservicios.curso.h2.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name="ACCOUNTS")
@IdClass(AccountId.class)
public class Account {
    @Id
    private String customerNumber;
    @Id
    private String accountNumber;
    private int productNumber;
    private String productName;
    private String status;
    private BigDecimal balance;
    private String creationDate;
    private String cardNumber;
}
