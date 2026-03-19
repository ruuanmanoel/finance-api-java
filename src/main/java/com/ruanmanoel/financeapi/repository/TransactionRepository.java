package com.ruanmanoel.financeapi.repository;

import com.ruanmanoel.financeapi.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
