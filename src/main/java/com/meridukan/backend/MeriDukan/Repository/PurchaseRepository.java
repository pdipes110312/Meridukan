package com.meridukan.backend.MeriDukan.Repository;

import com.meridukan.backend.MeriDukan.models.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase,Long> {
}
