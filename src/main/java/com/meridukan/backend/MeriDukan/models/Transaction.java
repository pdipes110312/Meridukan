package com.meridukan.backend.MeriDukan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    Long dateAndTime;
    List<Long> purchaseIds;

    public Transaction(List<Long> purchaseIds) {
        this.purchaseIds = purchaseIds;
        this.dateAndTime = System.currentTimeMillis();
    }

    public Transaction() {
    }

    public List<Long> getPurchaseIds() {
        return purchaseIds;
    }

    public void setPurchaseIds(List<Long> purchaseIds) {
        this.purchaseIds = purchaseIds;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Long dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
