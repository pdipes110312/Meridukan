package com.meridukan.backend.MeriDukan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    Long productID;
    String productName;

    public Search(Long productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public Search() {
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.productName + this.productID;

    }


}
