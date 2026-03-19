package com.ruanmanoel.financeapi.controller;

import com.ruanmanoel.financeapi.model.User;
import com.ruanmanoel.financeapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listarUsuarios() {
        return userService.listarUsuarios();
    }

   @PostMapping
    public void criarUsuario(@RequestBody User user) {
        userService.criarUsuario(user);
    }
}
