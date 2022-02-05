package com.javacode.samples.thread;

public class ThreadExample extends Thread {

    @Override
    public void run(){
        for(int i = 0; i < 100; i++)
            System.out.println(this.getName());
    }
}
