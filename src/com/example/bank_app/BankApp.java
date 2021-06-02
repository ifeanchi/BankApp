package com.example.bank_app;

public class BankApp {
    public static void main(String[] args){
        BankAccount customerAcct = new BankAccount(100, 200);
       System.out.println("Your checking opening balance is : " + customerAcct.getCheckingBalance());
        System.out.println("Your savings opening balance is : " + customerAcct.getSavingsBalance());
        customerAcct.checkingWithdrawal(20);
        System.out.println(customerAcct.getCheckingBalance());
    }
}
