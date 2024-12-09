package com.meridukan.backend.MeriDukan.services;

import com.meridukan.backend.MeriDukan.Repository.ProductRepository;
import com.meridukan.backend.MeriDukan.Repository.PurchaseRepository;
import com.meridukan.backend.MeriDukan.models.Purchase;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;
    public Purchase savePurchase(Purchase purchase){
        purchaseRepository.save(purchase);
        return  purchase;
    }
    public List<Purchase> getPurchase(){
        return (List<Purchase>) purchaseRepository.findAll();
    }
    public void deletePurchase(Long id ){
        purchaseRepository.deleteById(id);

    }
}
