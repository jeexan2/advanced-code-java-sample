package com.javacode.samples.method_reference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Square {
    int sideLength;

    public int calculateArea(){ return sideLength * sideLength;}
}
