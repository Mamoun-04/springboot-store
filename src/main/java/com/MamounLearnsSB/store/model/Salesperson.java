package com.MamounLearnsSB.store.model;

import jakarta.persistence.*;

@Entity
public class Salesperson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int numSales = 0;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumSales() { return numSales; }
    public void setNumSales(int numSales) { this.numSales = numSales; }
}
