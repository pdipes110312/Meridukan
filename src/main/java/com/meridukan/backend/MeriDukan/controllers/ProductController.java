package com.meridukan.backend.MeriDukan.controllers;
import com.meridukan.backend.MeriDukan.models.Product;
import com.meridukan.backend.MeriDukan.services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/")
    public ResponseEntity<List<Product>> getProducts(){
      return  ResponseEntity.ok(productService.products());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProducts(@PathVariable("id") Long searchString){
        return  ResponseEntity.ok(productService.productWith(searchString));
    }
    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Product saveProduct(@RequestBody Map<String,String> receivedJson, HttpServletRequest request){
        String weight =  receivedJson.get("weight");
        String weight_unit =  receivedJson.get("weight_unit");
        String price_unit =  receivedJson.get("price_unit");
        String price =  receivedJson.get("price");
        Product product  = new Product(weight,weight_unit,price_unit,price);
        System.out.println(product);
        productService.saveProduct(product);
        return product;
    }
    @GetMapping(value = "/popular")
    public List<ResponseEntity<Product>> getRecentlyAdded(){
          List<ResponseEntity<Product>> recentlyAdded = new ArrayList<>();
          return  recentlyAdded;
    }
}
