package com.javacode.samples.linkare;

import lombok.Data;

import java.util.*;

//@Data
public final class Orders {
    HashMap<Calendar, Order> orderMap;
    List<Calendar> calendarList;
    public Orders(){
        orderMap = new HashMap<>();
        calendarList = new ArrayList<>();
    }

    public void pushOrder( Order order, java.util.Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        orderMap.put(calendar,order);
        calendarList.add(calendar);
    }

    public Order[] getOrders(){
        Order[] orders = new Order[calendarList.size()];
        Collections.sort(calendarList);
        int idx = 0;
        for(Calendar calendar: calendarList){
            orders[idx] = orderMap.get(calendar);
            idx++;
        }
        return orders;
    }
}
