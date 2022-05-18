package com.test.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.project.dto.ProductDTO;
import com.test.project.dto.RequestProductDTO;
import com.test.project.model.ProductModel;
import com.test.project.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/prdct-home")
	public String home() {
		return "Welcome to Product";
	}
	
	@GetMapping("/getAllProducts")
	public List<ProductDTO> getAllProducts(){
		List<ProductDTO> products = productService.getProducts();
		return products;
	}
	
	@PostMapping("/saveProduct")
	public Integer saveProduct(@RequestBody RequestProductDTO product) {
		Integer productId = productService.saveProduct(product);
		return productId;
	}
	
	@PostMapping("/saveAllProducts")
	public List<Integer> saveAllProduct(@RequestBody List<RequestProductDTO> product) {
		List<Integer> productIds = productService.saveAllProducts(product);
		return productIds;
	}
	
}
