package com.ruanmanoel.financeapi.service;

import com.ruanmanoel.financeapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    @Autowired
    TransactionRepository transactionRepository;

    public Double calcularSaldo(){
        return transactionRepository.calcularSaldo();
    }
}
