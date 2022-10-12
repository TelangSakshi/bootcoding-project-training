package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class Order {
    private long orderId;
    private String deliveryAddress;
    private List<OrderMenuItem> menuitem;
    private Date orderDate;
    private Vendor vendor;
    private double totalAmount;
    private Customer customer;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<OrderMenuItem> getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(List<OrderMenuItem> menuitem) {
        this.menuitem = menuitem;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    public com.online.restaurant.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.online.restaurant.Customer customer) {
        this.customer = customer;
    }
}
