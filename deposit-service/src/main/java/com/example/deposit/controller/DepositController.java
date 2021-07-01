package com.example.deposit.controller;

import com.example.deposit.controller.dto.DepositRequestDTO;
import com.example.deposit.controller.dto.DepositResponseDTO;
import com.example.deposit.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {

    private final DepositService depositService;

    @Autowired
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @PostMapping("/")
    public DepositResponseDTO deposit(@RequestBody DepositRequestDTO requestDTO) {
        return depositService.deposit(requestDTO.getAccountID(), requestDTO.getBillId(), requestDTO.getAmount());
    }
}
