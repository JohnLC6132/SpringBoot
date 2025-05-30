package com.microservicios.curso.h2.repository;

import com.microservicios.curso.h2.model.Account;
import com.microservicios.curso.h2.model.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

//public interface AccountRepository extends JpaRepository <Account, AccountId> { }



public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> findByCardNumber(String cardNumber);
}