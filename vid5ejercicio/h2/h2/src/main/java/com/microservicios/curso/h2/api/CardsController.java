package com.microservicios.curso.h2.api;

import com.microservicios.curso.h2.model.Card;
import com.microservicios.curso.h2.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CardsController {

    @Autowired
    private CardsService cardsService;

    @GetMapping("/cards/{accountNumber}")
    public List<Card> getCardsByAccountNumber(@PathVariable("accountNumber") String accountNumber){
        return  cardsService.getCardsByAccountNumber(accountNumber);
    }
}
