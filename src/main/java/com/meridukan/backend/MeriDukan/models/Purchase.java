package com.meridukan.backend.MeriDukan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long purchaseID;
    String name;
    String productId;

    String quantity;
    String price;

    public Purchase(String name, int age) {
    }

    public Purchase(String name, String productId, String quantity, String price) {
        this.name = name;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public Purchase() {
    }

    public Long getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(Long purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
