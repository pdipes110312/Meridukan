package com.meridukan.backend.MeriDukan.controllers;
//Primary job of this controller is maintain purchases
//A purchase contains a product and its price and its quantity

import com.meridukan.backend.MeriDukan.models.Product;
import com.meridukan.backend.MeriDukan.models.Purchase;
import com.meridukan.backend.MeriDukan.models.Search;
import com.meridukan.backend.MeriDukan.services.ProductService;
import com.meridukan.backend.MeriDukan.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/purchase")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;
    @GetMapping("/")
    ResponseEntity<List<Purchase>> getPurchase(){
       return ResponseEntity.ok(purchaseService.getPurchase());
    }
    @PostMapping("/")
    ResponseEntity<Purchase>savePurchase(@RequestBody Map<String, String> purchase){
        String productId =  purchase.get("productId");
        String productName = purchase.get("name");
        String quantity = purchase.get("quantity");
        String price = purchase.get("price");
        Purchase purchase1 = new Purchase(productName,productId,quantity,price);
        return ResponseEntity.ok(purchaseService.savePurchase(purchase1));
    }
    @DeleteMapping("{id}")
    public void deletPurchase(@PathVariable("id") int id) {
        purchaseService.deletePurchase((long) id);

    }


}
