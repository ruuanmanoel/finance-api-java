package com.ruanmanoel.financeapi.controller;

import com.ruanmanoel.financeapi.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class BalanceController {
    @Autowired
    BalanceService balanceService;

    @GetMapping
    public Double calcularSaldo(){
        return balanceService.calcularSaldo();
    }
}
