package com.microservicios.curso.h2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@Entity
@Table(name="CARDS")
@IdClass(CardId.class)
public class Card {
    @Id
    private String accountNumber;

    @Id
    private String cardNumber;

    private String cardType;
    private String status;
    private String creationDate;

}
