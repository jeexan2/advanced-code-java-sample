package com.javacode.samples.generics;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class GenericSample {
    List names = new ArrayList();

    public <T> List<T> arrayToList(T[] arr,List<T> list){

        for(T ar: arr){
            list.add(ar);
        }
        return list;
    }

//    public <T> T sum(T a,T b){
//        T sum = a + b;
//        return sum;
//    }

}
