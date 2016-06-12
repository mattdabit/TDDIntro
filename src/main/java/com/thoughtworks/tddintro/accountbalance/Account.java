package com.thoughtworks.tddintro.accountbalance;

/**
 * Account class
 * Created by matt on 6/7/16.
 */
public class Account {
    public int balance;
    public Account(int init_balance){
        this.balance = init_balance;
    }

    public void makeDeposit(int amt){
        this.balance += amt;
        System.out.println("Your new balance is: " + getBalance());
    }
    public void makeWithdrawl(int amt){
        if (amt > this.balance){
            System.out.println("Sorry you have insufficient funds for this withdrawl.");
        }else{
            this.balance -=amt;
            System.out.println("Your new balance is: " + getBalance());
        }
    }
    public int getBalance(){
        return this.balance;
    }
}