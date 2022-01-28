package com.javacode.samples;

import com.javacode.samples.generics.GenericSample;
import com.javacode.samples.overriding_methods.OverRidingMethods;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplesApplication.class, args);
//		GenericSample genericSample = new GenericSample();
//		genericSample.getNames().add("ad");
//		genericSample.getNames().add(1);
//		List names = genericSample.getNames();
//
//		for(int i = 0; i < names.size();i++){
//			System.out.println(names.get(i));
//		}
		OverRidingMethods overRidingMethods = new OverRidingMethods();
//		System.out.print(overRidingMethods.toString());

	}

}
