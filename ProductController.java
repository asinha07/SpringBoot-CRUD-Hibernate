package com.example.demo.Controller;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.entity.*;
@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		
		return service.saveProduct(product);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String RemoveProduct(@PathVariable int id) {
		
		return service.deleteProduct(id);
		
	}
	@PutMapping("/update")
	public Product UpdateProduct(@RequestBody Product product) {
	
		
	return service.updateProduct(product);
	
	}	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
	
	return service.GetProductById(id);
	
	}
	@GetMapping("/products/{name}")
	public Product getProductByName(@PathVariable String name) {
	
	return service.GetProductByName(name);
	
	}

}
