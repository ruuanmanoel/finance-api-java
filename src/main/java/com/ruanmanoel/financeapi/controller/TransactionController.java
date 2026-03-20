package com.ruanmanoel.financeapi.controller;

import com.ruanmanoel.financeapi.model.Transaction;
import com.ruanmanoel.financeapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping
    public List<Transaction> listarTransacoes(@RequestParam(required = false) Long userId) {
        if (userId != null) {
            return transactionService.listarTransacoesPorUsuario(userId);
        }
        return transactionService.listarTransacoes();
    }

    @GetMapping("/{id}")
    public Optional<Transaction> listarTransacao(@PathVariable long id) {
        return transactionService.listarTransacao(id);
    }

    @PostMapping
    public void adicionarTransacao(@RequestBody Transaction transaction) {
        transactionService.adicionarTransaction(transaction);
    }

}
