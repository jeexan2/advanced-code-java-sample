package com.javacode.samples;

import com.javacode.samples.advanced_data_structures.HashMapSample;
import com.javacode.samples.advanced_data_structures.LinkedHashMapSample;
import com.javacode.samples.advanced_data_structures.LinkedListSample;
import com.javacode.samples.advanced_data_structures.QueueSample;
import com.javacode.samples.functional_interface.FuntionalInterfaceExample;
import com.javacode.samples.generics.GenericSample;
import com.javacode.samples.iostreams.BufferedReaderExample;
import com.javacode.samples.linkare.Order;
import com.javacode.samples.linkare.Orders;
import com.javacode.samples.linkare.Test1;
import com.javacode.samples.linkare.Test2;
import com.javacode.samples.method_reference.MethodReferenceExample;
import com.javacode.samples.overriding_methods.OverRidingMethods;
import com.javacode.samples.streams.Library;
import com.javacode.samples.thread.RunnableInterfaceExample;
import com.javacode.samples.thread.ThreadExample;
import com.javacode.samples.thread.deadlock.Kitchen;
import com.javacode.samples.thread.synchronization.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.LinkedHashMap;
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
//		OverRidingMethods overRidingMethods = new OverRidingMethods();
//		System.out.print(overRidingMethods.toString());
//		LinkedListSample linkedListSample = new LinkedListSample();
//		linkedListSample.examples();
//		QueueSample queueSample = new QueueSample();
//		queueSample.examples();
//		Orders orders = new Orders();
//		orders.pushOrder(new Order(),new Date());
////		orders.getOrders();
//		Order[] orders_ = orders.getOrders();
//
//		System.out.println(orders_.length);
//		Test1 test1 = new Test1();
//		Test2 test2 = new Test2();
//		HashMapSample hashMapSample = new HashMapSample();
//		hashMapSample.exmaples();
//		LinkedHashMapSample linkedHashMapSample = new LinkedHashMapSample();
//		linkedHashMapSample.samples();
//		FuntionalInterfaceExample funtionalInterfaceExample = new FuntionalInterfaceExample();
//		funtionalInterfaceExample.examples();
//		MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
//		methodReferenceExample.examples();

//		Library library = new Library();
//		library.examples();
//		System.out.println(Thread.activeCount());
//		ThreadExample threadExample = new ThreadExample();
//		threadExample.setName("My first thread");
//		threadExample.start();
//
//		ThreadExample threadExample1 = new ThreadExample();
//		threadExample1.setName("My second thread");
//		threadExample1.start();

//		Thread thread = new Thread(new RunnableInterfaceExample());
//		thread.start();
//
//		Thread sThread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i = 0; i < 100; i++)
//					System.out.println(i+" "+Thread.currentThread().getName());
//			}
//		});
//
//		sThread.start();
//		Users users = new Users();
//		users.examples();
//		Kitchen kitchen = new Kitchen();
//		kitchen.examples();
		BufferedReaderExample bufferedReaderExample = new BufferedReaderExample();
		bufferedReaderExample.examples();
	}

}
