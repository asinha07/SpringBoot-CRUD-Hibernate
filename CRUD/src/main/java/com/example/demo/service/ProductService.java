package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.*;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	public Product GetProductById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	public Product GetProductByName(String name)
	{
		return repository.findByName(name);
	}
	public String deleteProduct(int id)
	{
		repository.deleteById(id);
		return "product removed ||"+id;
	}
	public Product updateProduct(Product product)
	{
		Product existingproduct	=repository.findById(product.getId()).orElse(null);
		existingproduct.setName(product.getName());
		existingproduct.setQuantity(product.getQuantity());
		existingproduct.setPrice(product.getPrice());
		return repository.save(existingproduct);
		
	}
}
