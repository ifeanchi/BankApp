package com.example.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit){
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        this.checkingBalance+= checkingOpeningDeposit;
        this.savingsBalance+= savingsOpeningDeposit;
    }
    public double getCheckingBalance(){
        return checkingBalance;

    }
    public double getSavingsBalance(){
        return savingsBalance;

    }
    public void printBal(){
        System.out.println()
    }
}

