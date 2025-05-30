package com.example.springsession.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.context.annotation.Scope;

import java.io.Serializable;

@Component
@SessionScope

public class Counter implements Serializable {

    private Integer value = 0;

    public Integer incrAndGet() {
        this.value++;
        return this.value;
    }

}
