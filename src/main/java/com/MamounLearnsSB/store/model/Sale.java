package com.MamounLearnsSB.store.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Salesperson salesperson;

    private double salePrice;
    private LocalDateTime saleDate = LocalDateTime.now();

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }

    public Salesperson getSalesperson() { return salesperson; }
    public void setSalesperson(Salesperson salesperson) { this.salesperson = salesperson; }

    public double getSalePrice() { return salePrice; }
    public void setSalePrice(double salePrice) { this.salePrice = salePrice; }

    public LocalDateTime getSaleDate() { return saleDate; }
    public void setSaleDate(LocalDateTime saleDate) { this.saleDate = saleDate; }
}
