package com.meridukan.backend.MeriDukan.services;

import com.meridukan.backend.MeriDukan.Repository.ProductRepository;
import com.meridukan.backend.MeriDukan.Repository.SearchRepository;
import com.meridukan.backend.MeriDukan.models.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    SearchRepository searchRepository;
    public List<Search> getSearchWithName(String name ) {
         List<Search> searches  = (List<Search>) searchRepository.findAll();
         List<Search>filteredSearch = new ArrayList<Search>();
         for ( Search search : searches) {
             if (search.getProductName().contains(name)) {
                 filteredSearch.add(search);
             }
         }
         return  filteredSearch;
    }
    public Search setSearch(Search search) {
        searchRepository.save(search);
        return  search;
    }

}
