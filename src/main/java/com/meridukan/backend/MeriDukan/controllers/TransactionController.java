package com.meridukan.backend.MeriDukan.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.meridukan.backend.MeriDukan.models.Product;
import com.meridukan.backend.MeriDukan.models.Purchase;
import com.meridukan.backend.MeriDukan.models.Transaction;
import com.meridukan.backend.MeriDukan.services.PurchaseService;
import com.meridukan.backend.MeriDukan.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;
    @Autowired
    PurchaseService purchaseService;
    @GetMapping(value = "/")
    public ResponseEntity<List<Transaction>> getProducts(){
        return  ResponseEntity.ok(transactionService.getTransactions());
    }
    @PostMapping(value = "/")
    public ResponseEntity<String> setTransaction(@RequestBody  Map<String,Long[]> purchaseIds) {
        List<Long> items = new ArrayList<>();
        items = List.of(purchaseIds.get("purchaseIds"));
        Transaction transaction = new Transaction(items);
        return  ResponseEntity.ok(transactionService.setTransaction(transaction));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Transaction>> getProduwithId(@PathVariable Long id){
        return  ResponseEntity.ok(transactionService.getTransaction(id));
    }

}
