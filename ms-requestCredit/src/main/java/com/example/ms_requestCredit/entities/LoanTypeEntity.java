package com.example.ms_requestCredit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan_type")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoanTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String type;
    private int years;
    private double interestRate;
    private double financeRate;
    private String rutClient;
    private double monthlyPayment = 0;
    private double totalCost = 0;
}
