package com.meridukan.backend.MeriDukan.services;

import com.meridukan.backend.MeriDukan.Repository.ProductRepository;
import com.meridukan.backend.MeriDukan.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public Product saveProduct(Product product) {
        Product save = repository.save(product);
        return product;
    }

    public @ResponseBody
    List<Product> products() {
        List<Product> items = new ArrayList<Product>();
        items = (List<Product>) repository.findAll();
        return items;
    }

    public @ResponseBody
    Optional<Product> productWith(Long id) {
        return repository.findById(id);
    }
}
