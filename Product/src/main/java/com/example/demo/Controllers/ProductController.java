package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProoduct(product);
	}
	
	@GetMapping("/")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	

}
