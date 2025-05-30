package com.microservicios.curso.h2.business;

import com.microservicios.curso.h2.model.Account;
import com.microservicios.curso.h2.model.AccountId;
import com.microservicios.curso.h2.repository.AccountRepository;
import com.microservicios.curso.h2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Optional<Account> getAccountByCardNumber(String cardNumber) {
        return accountRepository.findByCardNumber(cardNumber);
    }

    /*
    private final static String STATUS = "act";

    public List<Account> getAccounts(){

        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().filter(account -> account.getStatus().equals(STATUS)).collect(Collectors.toList());
    }


    @Override
    public List<Account> getCustomerAccounts(String customerNumber) {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .filter(account -> account.getCustomerNumber().equals(customerNumber))
                .filter(account -> account.getStatus().equals(STATUS))
                .collect(Collectors.toList());
    }//cambio 2
    */



    public Account getAccount(AccountId accountId){

        return null;
    }
}
