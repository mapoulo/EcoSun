package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repositories.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	public Product saveProoduct(Product product) {
		return repo.save(product);
	}
	
	
	public List<Product> getAllProducts(){
		return repo.findAll().stream().toList();
	}

}
