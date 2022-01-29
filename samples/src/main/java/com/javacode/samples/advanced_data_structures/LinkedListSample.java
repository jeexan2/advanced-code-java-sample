package com.javacode.samples.advanced_data_structures;

import lombok.Data;

import java.util.LinkedList;

@Data
public class LinkedListSample {
    public void examples(){
        LinkedList<String> myList = new LinkedList();
        myList.add("a");
        myList.add("b");
        myList.add(1,"c");

        System.out.println(myList);

        myList.remove("c");
        System.out.println(myList);
    }
    ;
}
