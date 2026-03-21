package com.ruanmanoel.financeapi.controller;

import com.ruanmanoel.financeapi.config.TokenService;
import com.ruanmanoel.financeapi.dto.LoginRequestDTO;
import com.ruanmanoel.financeapi.dto.LoginResponseDTO;
import com.ruanmanoel.financeapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO loginRequestDTO) {
        boolean valido = userService.validarLogin(loginRequestDTO.getEmail(), loginRequestDTO.getSenha());

        if (!valido) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Email ou senha inválidos"
            );
        }

        String token = tokenService.gerarToken(loginRequestDTO.getEmail());

        return new LoginResponseDTO(token);
    }
}
