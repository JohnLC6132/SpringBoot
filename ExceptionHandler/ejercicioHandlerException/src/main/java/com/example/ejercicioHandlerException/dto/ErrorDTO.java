package com.example.ejercicioHandlerException.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private  String code, message;

}
