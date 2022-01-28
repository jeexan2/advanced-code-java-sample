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

    // var args
    public <T> List<T> varArgsTest(T... args){
        List<T> ret = new ArrayList<T>();
        for(T arg: args)
            ret.add(arg);

        return ret;
    }

}
