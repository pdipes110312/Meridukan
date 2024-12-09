package com.meridukan.backend.MeriDukan.controllers;

import com.meridukan.backend.MeriDukan.models.Search;
import com.meridukan.backend.MeriDukan.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/search")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class SearchController {

    @Autowired
    SearchService searchService;
    @GetMapping("/{id}")
    List<Search> getIdFromName(@PathVariable("id") String searchString) {
         return  searchService.getSearchWithName(searchString);
    }
    @PostMapping("/")
    Search setNames(@RequestBody Map<String, String> search) {
        String productId =  search.get("productID");
        Long productIDLong = Long.valueOf(productId);
        String productName = search.get("productName");
        Search search1 = new Search(productIDLong,productName);
        return searchService.setSearch(search1);
    }

}
