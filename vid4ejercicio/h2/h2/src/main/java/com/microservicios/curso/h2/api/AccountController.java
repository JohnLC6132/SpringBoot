package com.microservicios.curso.h2.api;

import com.microservicios.curso.h2.model.Account;
import com.microservicios.curso.h2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /*
    @GetMapping("/accounts/{customerNumber}")
    public List<Account> accountsRetrieve(@PathVariable("customerNumber") String customerNumber){
        return accountService.getCustomerAccounts(customerNumber);//cambio3
    }

     */
    @GetMapping("/accounts/card/{cardNumber}")
    public ResponseEntity<Account> getAccountByCardNumber(@PathVariable String cardNumber) {
        Optional<Account> account = accountService.getAccountByCardNumber(cardNumber);
        return account.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
