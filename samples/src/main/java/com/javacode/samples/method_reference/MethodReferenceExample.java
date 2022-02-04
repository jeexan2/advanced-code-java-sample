package com.javacode.samples.method_reference;

import lombok.Data;

@Data
public class MethodReferenceExample {
    public void examples(){
        Square s = new Square(4);

//        Shapes shapes = (Square square)->{
//            return square.calculateArea();
//        };
        Shapes shapes = Square::calculateArea;

        System.out.println(shapes.getArea(s));
    }
}
