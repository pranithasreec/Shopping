package com.example.demo.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Item;
import com.example.demo.JpaRepository.ItemRepo;

@Service
public class ItemService {

    @Autowired
    ItemRepo repo;

    public Item addItem(Item item) {
        return repo.save(item);
    }

    
    
}
