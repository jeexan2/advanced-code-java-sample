package com.javacode.samples.linkare;

public class Singleton {
    private static Singleton singletonObject;
    private Singleton(){ }
    public static Singleton getSingletonObject(){
        if(singletonObject == null)
            singletonObject = new Singleton();
        return singletonObject;
    }
}
