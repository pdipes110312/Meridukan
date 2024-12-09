package com.meridukan.backend.MeriDukan.Repository;

import com.meridukan.backend.MeriDukan.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
