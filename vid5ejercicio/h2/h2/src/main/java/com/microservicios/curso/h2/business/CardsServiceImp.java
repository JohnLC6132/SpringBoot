package com.microservicios.curso.h2.business;

import com.microservicios.curso.h2.model.Card;
import com.microservicios.curso.h2.repository.CardsRepository;
import com.microservicios.curso.h2.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsServiceImp implements CardsService {

    @Autowired
    private CardsRepository cardsRepository;

    @Override
    public List<Card> getCardsByAccountNumber(String accountNumber){
        return cardsRepository.findByAccountNumber(accountNumber);
    }
}
