package com.javacode.samples.thread.synchronization;

import lombok.Data;

@Data
public class ATM {
    // synchronized - one thread at a time
    public static synchronized void withdraw(BankAccount bankAccount,int amount){
        if(bankAccount.getBalance() - amount < bankAccount.getOverdraft()){
            System.out.println("Transaction Denied");
        }else {
            bankAccount.setBalance(bankAccount.getBalance()-amount);
            System.out.println("Successfully Withdrawn");
        }

        System.out.println("Current Balance: "+bankAccount.getBalance());
    }
}
