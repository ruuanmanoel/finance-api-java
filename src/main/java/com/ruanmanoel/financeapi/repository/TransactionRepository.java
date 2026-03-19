package com.ruanmanoel.financeapi.repository;

import com.ruanmanoel.financeapi.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("""
        SELECT SUM(
            CASE 
                WHEN t.tipo = 'RECEITA' THEN t.valor 
                ELSE -t.valor 
            END
        )
        FROM Transaction t
    """)
    Double calcularSaldo();
}
