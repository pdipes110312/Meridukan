package com.meridukan.backend.MeriDukan.models;
import jakarta.persistence.*;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String weight;
    private String weight_unit;
    private String price_unit;
    private String price;

    public Product(String weight, String weight_unit, String price_unit, String price) {
        this.weight = weight;
        this.weight_unit = weight_unit;
        this.price_unit = price_unit;
        this.price = price;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return this.price +"\n" + this.weight + "\n" + this.id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public String getPrice_unit() {
        return price_unit;
    }

    public void setPrice_unit(String price_unit) {
        this.price_unit = price_unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
