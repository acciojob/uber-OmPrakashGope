package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "TripBooking")
public class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String fromLocation;
    private String toLocation;
    private int distanceInKm;
    private TripStatus status;
    private int bill;
    @ManyToOne
    @JoinColumn
    private Driver driver;

    public TripBooking(String fromLocation, String toLocation, int distanceInKm) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
    }

    @ManyToOne
    @JoinColumn
    private Customer customer;



    public int getTripBookingId() {
        return tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public TripStatus getStatus() {
        return status;
    }

    public int getBill() {
        return bill;
    }

    public Driver getDriver() {
        return driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}