package com.javacode.samples.thread.synchronization;

import lombok.Data;

@Data
public class Users {
    static final BankAccount account = new BankAccount(200);

    public void examples(){
        account.setBalance(account.getBalance()+100);

        Thread t1 = new Thread(()->{
//            System.out.println("Thread 1");
           ATM.withdraw(account,10);
        });

        Thread t2 = new Thread(()->{
//            System.out.println("Thread 2");
           ATM.withdraw(account,10);
        });

        t1.start();
        t2.start();
    }
}
