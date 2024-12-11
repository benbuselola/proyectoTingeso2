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
    private double monthlyPayment;
    private double totalCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getFinanceRate() {
        return financeRate;
    }

    public void setFinanceRate(double financeRate) {
        this.financeRate = financeRate;
    }

    public String getRutClient() {
        return rutClient;
    }

    public void setRutClient(String rutClient) {
        this.rutClient = rutClient;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}