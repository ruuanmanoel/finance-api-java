package com.ruanmanoel.financeapi.dto;

import lombok.Getter;

@Getter
public class LoginResponseDTO {
    private String mensagem;

    public LoginResponseDTO(String mensagem) {
        this.mensagem = mensagem;
    }
}
