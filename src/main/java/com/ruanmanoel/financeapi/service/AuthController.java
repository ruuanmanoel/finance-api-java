package com.ruanmanoel.financeapi.service;

import com.ruanmanoel.financeapi.dto.LoginRequestDTO;
import com.ruanmanoel.financeapi.dto.LoginResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping
    public LoginResponseDTO login(@RequestBody LoginRequestDTO loginRequestDTO) {
        boolean valido = userService.validarLogin(loginRequestDTO.getEmail(), loginRequestDTO.getSenha());

        if(!valido) {
            throw new RuntimeException("Email ou senha inválidos");
        }

        return new LoginResponseDTO("Logado com sucesso");
    }
}
