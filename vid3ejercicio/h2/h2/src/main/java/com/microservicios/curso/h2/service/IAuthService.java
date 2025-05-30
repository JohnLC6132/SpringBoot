package com.microservicios.curso.h2.service;

import com.microservicios.curso.h2.dto.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface IAuthService {
    ResponseEntity<?> login(LoginRequest request);
}
