package com.example.demo.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Item;

public interface ItemRepo extends JpaRepository<Item, String>{

}
