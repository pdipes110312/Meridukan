package com.meridukan.backend.MeriDukan.Repository;

import com.meridukan.backend.MeriDukan.models.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction,Long> {
}
