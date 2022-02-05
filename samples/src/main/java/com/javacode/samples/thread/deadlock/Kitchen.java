package com.javacode.samples.thread.deadlock;

public class Kitchen {
    // Avoid Nested Synchronization As possible
    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public void examples(){
        //Deadlock case
                Thread cook1 = new Thread(()->{
           synchronized (spoon){
               System.out.println("Cook1: Holding the spoon... Waiting for bowl");
               synchronized (bowl){
                   System.out.println("Cook1: Holding the bowl...Waiting for spoon");
               }
           }
        });

        Thread cook2 = new Thread(()->{
            synchronized (bowl){
                System.out.println("Cook2: Holding the bowl... Waiting for spoon");
                synchronized (spoon){
                    System.out.println("Cook2: Holding the spoon...Waiting for bowl");
                }
            }
        });

        // Solution
//        Thread cook1 = new Thread(()->{
//           synchronized (bowl){
//               System.out.println("Cook1: Holding the spoon... Waiting for bowl");
//               synchronized (spoon){
//                   System.out.println("Cook1: Holding the bowl...Waiting for spoon");
//               }
//           }
//        });
//
//        Thread cook2 = new Thread(()->{
//            synchronized (bowl){
//                System.out.println("Cook2: Holding the bowl... Waiting for spoon");
//                synchronized (spoon){
//                    System.out.println("Cook2: Holding the spoon...Waiting for bowl");
//                }
//            }
//        });

        cook1.start();
        cook2.start();
    }
}
