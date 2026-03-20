package com.ruanmanoel.financeapi.service;

import com.ruanmanoel.financeapi.model.Transaction;
import com.ruanmanoel.financeapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> listarTransacoes() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> listarTransacao(long id) {
        return transactionRepository.findById(id);
    }
    public Transaction adicionarTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> listarTransacoesPorUsuario(long userId) {
        return transactionRepository.findByUserId(userId);
    }
}
