package com.javacode.samples.thread;

// Runnable is interface so this class can be extended by other class
// That's why runnable is better than thread class
public class RunnableInterfaceExample implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++)
            System.out.println(Thread.currentThread().getName());
    }
}
