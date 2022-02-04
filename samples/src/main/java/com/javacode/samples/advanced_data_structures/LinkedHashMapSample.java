package com.javacode.samples.advanced_data_structures;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class LinkedHashMapSample {
    public void samples(){
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(4,0.75f,true);
        linkedHashMap.put("x",11);
        linkedHashMap.put("ab",12);
        linkedHashMap.put("ac",9);

        for(Map.Entry<String,Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
