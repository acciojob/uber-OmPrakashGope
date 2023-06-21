package com.driver.model;

import javax.persistence.*;
import java.sql.Driver;

@Entity
@Table(name = "Cab")
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int perKmRate;
    private boolean available;
    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    private Driver driver;

    public int getId() {
        return Id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}