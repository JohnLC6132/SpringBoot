package com.microservicios.curso.h2.service;

import com.microservicios.curso.h2.model.Account;
import com.microservicios.curso.h2.model.AccountId;
import java.util.List;
import java.util.Optional;

public interface AccountService {
    //List<Account> getCustomerAccounts(String customerNumber);//cambio 1

    //Account getAccount(AccountId accountId);
    Optional<Account> getAccountByCardNumber(String cardNumber);
}
