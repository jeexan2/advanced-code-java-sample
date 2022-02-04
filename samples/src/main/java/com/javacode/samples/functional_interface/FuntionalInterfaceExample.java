package com.javacode.samples.functional_interface;

import lombok.Data;

@Data
public class FuntionalInterfaceExample {
    public void examples(){
        GreetingInterface greetingInterface = new GreetingInterface() {
            @Override
            public void greet(String message) {
                System.out.println("Hello "+message);
            }
        };

        greetingInterface.greet("Jysan");

        GreetingInterface greetingInterface2 = (String message)->{
          System.out.println("Hello "+message);
        };

        greetingInterface2.greet("Jysan");
    }
}
