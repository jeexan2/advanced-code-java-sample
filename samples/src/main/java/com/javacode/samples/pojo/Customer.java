package com.javacode.samples.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private Boolean hasBeenServed;

    public void serve(){
        this.hasBeenServed = true;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
