package com.javacode.samples.subtype;

import lombok.Data;

import java.util.List;

@Data
public class Base {
    public void childExtended(List<? extends Base> list){

    }
}
