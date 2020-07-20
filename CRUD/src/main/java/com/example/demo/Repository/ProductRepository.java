package com.example.demo.Repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
//import entity.Product;
public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByName(String name);
	

}
