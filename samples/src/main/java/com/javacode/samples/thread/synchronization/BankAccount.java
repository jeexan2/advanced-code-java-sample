package com.javacode.samples.thread.synchronization;

import lombok.Data;

@Data
public class BankAccount {
    private int balance = 0;
    private final int overdraft;
    public BankAccount(int overdraft_){
        this.overdraft = overdraft_;
    }
}
