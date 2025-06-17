package com.example.demo.Controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Item;
import com.example.demo.Service.ItemService;

@RestController
public class ItemController {

    @Autowired
    ItemService service;

    
    @PostMapping("/saveitems")
    public Item saveItem(@RequestBody Item i) {
        return service.addItem(i);
    }

    
    

    
}