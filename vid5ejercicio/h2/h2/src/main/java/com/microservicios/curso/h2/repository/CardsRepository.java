package com.microservicios.curso.h2.repository;

import com.microservicios.curso.h2.model.Card;
import com.microservicios.curso.h2.model.CardId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CardsRepository extends JpaRepository<Card, CardId> {

    List<Card> findByAccountNumber(String accountNumber);
}
