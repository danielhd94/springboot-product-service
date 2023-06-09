package com.springboot.app.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.products.models.entity.Product;
import com.springboot.app.products.models.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/list")
	public List<Product> listAll() {
		return productService.findAll();
	}

	@GetMapping("/detail/{id}")
	public Product detail(@PathVariable Long id) {
		return productService.findById(id);
	}
}
