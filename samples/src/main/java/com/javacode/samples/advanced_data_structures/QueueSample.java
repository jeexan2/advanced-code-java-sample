package com.javacode.samples.advanced_data_structures;

import com.javacode.samples.pojo.Customer;
import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;

@Data
public class QueueSample {
    public void examples(){
        Queue<Customer> customerQueue = new LinkedList<Customer>();
        customerQueue.add(new Customer("Rakib",false));
        customerQueue.add(new Customer("Akib",false));
        customerQueue.add(new Customer("Mkib",false));

        printQueue(customerQueue);
        serveACustomer(customerQueue);
        printQueue(customerQueue);
    }

    public void serveACustomer(Queue<Customer> customerQueue){
        Customer customer = customerQueue.poll();
        customer.serve();
    }

    public void printQueue(Queue<Customer> customerQueue){
        System.out.println("Printing Start of Queue");
        LinkedList<Customer> customers = (LinkedList<Customer>) customerQueue;
        for(Customer customer: customers){
            System.out.println(customer.toString());
        }
        System.out.println("Printing End of Queue");
    }


}
