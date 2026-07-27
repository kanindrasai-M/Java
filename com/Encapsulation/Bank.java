package com.Encapsulation;

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // set values
        account.setAccountNumber("110022279270");
        account.setBalance(200);

        // get values
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
