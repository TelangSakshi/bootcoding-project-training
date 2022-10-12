package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Customer sakshi = new Customer();

        sakshi.setName("Sakshi");
        sakshi.setCity("Nagpur");
        sakshi.setAddress("New Nandanwan,Nagpur");
        sakshi.setState("Maharashtra");
        sakshi.setEmailId("abc@gmail.com");
        sakshi.setPhoneNumber(9090909090L);

        System.out.println("Name :"+sakshi.getName());
        System.out.println("City: "+sakshi.getCity());
        System.out.println("Address: "+sakshi.getState());
        System.out.println("State: "+sakshi.getEmailId());
        System.out.println("Phone Number :"+sakshi.getPhoneNumber());



        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("ajni Square ,Nagpur");
        haldiram.setCategory("Veg");
        haldiram.setPhoneNumber(672345632);
        haldiram.setRating(5.0);
        haldiram.setState("Maharastra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name: "+haldiram.getName());
        System.out.println("Address :"+haldiram.getAddress());
        System.out.println("Category: "+haldiram.getCategory());
        System.out.println("Phone :"+haldiram.getPhoneNumber());
        System.out.println("Rating :"+haldiram.getRating());
        System.out.println("Address :"+haldiram.getState());
        System.out.println("City : "+haldiram.getCity());




        Order order = new Order();
        order.setCustomer(sakshi);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101, Civil Lines, Nagpur");

        System.out.println("Order Detail: ");
        System.out.println("Total Amount: "+order.getTotalAmount());
        System.out.println("Order Date:"+order.getOrderDate());
        System.out.println("Order Delivery Address: "+order.getDeliveryAddress());

    }
}
