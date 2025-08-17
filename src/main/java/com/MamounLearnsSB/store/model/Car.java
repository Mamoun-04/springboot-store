package com.MamounLearnsSB.store.model;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin;
    private String make;
    private String model;

    @Column(name = "manufacture_year") // ✅ renamed column
    private int year;

    private double cost;
    private boolean sold = false;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public boolean isSold() { return sold; }
    public void setSold(boolean sold) { this.sold = sold; }
}
