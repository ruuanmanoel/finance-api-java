package com.ruanmanoel.financeapi.service;

import com.ruanmanoel.financeapi.model.User;
import com.ruanmanoel.financeapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> listarUsuarios(){
        return userRepository.findAll();
    }

    public void criarUsuario(User user){
        userRepository.save(user);
    }
}
