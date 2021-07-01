package com.example.deposit.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DepositRequestDTO {

    private  Long accountID;

    private Long billId;

    private BigDecimal amount;
}
