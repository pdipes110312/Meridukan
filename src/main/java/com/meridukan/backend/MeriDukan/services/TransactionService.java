package com.meridukan.backend.MeriDukan.services;

import com.meridukan.backend.MeriDukan.Repository.TransactionRepository;
import com.meridukan.backend.MeriDukan.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    public List<Transaction> getTransactions(){
        return (List<Transaction>) transactionRepository.findAll();
    }
    public String setTransaction(Transaction transaction){
        transactionRepository.save(transaction);
        return  "done";
    }
    public Optional<Transaction> getTransaction(Long id) {
        return transactionRepository.findById(id);
    }
}
