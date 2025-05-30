package com.microservicios.curso.h2.service;

import com.microservicios.curso.h2.model.Card;

import java.util.List;

public interface CardsService {
    List<Card> getCardsByAccountNumber(String accountNumber);
}
