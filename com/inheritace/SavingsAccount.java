package com.inheritace;

public class SavingsAccount extends BankAccount{
    public void display(){
        super.withdrawal();
        super.deposite();
    }
    public void withdrawal() {
        System.out.println("This withdrawal from savings account");
    }
    public void deposite() {
        System.out.println("This deposite from savings account");
    }
}
