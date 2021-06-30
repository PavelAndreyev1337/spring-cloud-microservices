package com.example.account.entity;

import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    private String name;

    private String email;

    private String phone;

    private OffsetDateTime createDate;

    @ElementCollection
    private List<Long> bills;

    public Account(String name, String email, String phone, OffsetDateTime createDate, List<Long> bills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createDate = createDate;
        this.bills = bills;
    }
}
