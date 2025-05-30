package com.example.ejercicioHandlerException.controller;


import com.example.ejercicioHandlerException.dto.User;
import com.example.ejercicioHandlerException.exception.BusinessException;
import com.example.ejercicioHandlerException.exception.RequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity saveUser(@RequestBody User user){
        if(user.getEmail().equals("") || user.getEmail() == null){
            throw new RequestException("P-401","Email requerido");
        }
        if(user.getName().equals("") || user.getName() == null){
            throw new RequestException("P-402","Nombre requerido");
        }
        if(user.getEmail().equals("john@gmail.com")){
            throw new BusinessException("P-300", HttpStatus.INTERNAL_SERVER_ERROR, "El email ya existe");
        }
        return new ResponseEntity(HttpStatus.CREATED);

    }

    @PutMapping("{id}")
    public ResponseEntity updateUser(@PathVariable("id") Long id, @RequestBody User user){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
