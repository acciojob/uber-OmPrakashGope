package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String mobile;
    private String password;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    public int getCustomerId() {
        return customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }
    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}