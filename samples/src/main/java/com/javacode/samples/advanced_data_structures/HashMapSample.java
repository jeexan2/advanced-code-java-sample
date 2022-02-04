package com.javacode.samples.advanced_data_structures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class HashMapSample {
    public void exmaples(){
        HashMap<String,Integer> phoneBook = new HashMap<>();
        phoneBook.put("x",11);
        phoneBook.put("ab",12);
        phoneBook.put("ac",9);
//        if(phoneBook.containsKey("aa"))
//            System.out.println(phoneBook.get("aa"));
        for(Map.Entry<String,Integer> entry: phoneBook.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        phoneBook.clear();
    }
}
