package com.test.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.project.dto.ProductDTO;
import com.test.project.dto.RequestProductDTO;
import com.test.project.model.ProductModel;
import com.test.project.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public List<ProductDTO> getProducts(){
		List<ProductDTO> productDtoList = new ArrayList<>();
		List<ProductModel> products = productRepo.findAll();
		for(ProductModel prdct: products) {
			ProductDTO dto = new ProductDTO();
			dto.setProductId(prdct.getProductId());
			dto.setProductName(prdct.getProductName());
			dto.setProductDesc(prdct.getProductDesc());
			dto.setProductImageUrl(prdct.getProductImageUrl());
			dto.setQuantityAvail(prdct.getQuantityAvail());
			dto.setProductCategory(prdct.getProductCategory());
			productDtoList.add(dto);
		}
		return productDtoList;
	}
	
	public Integer saveProduct(RequestProductDTO product) {
		ProductModel prdct = new ProductModel();
		prdct.setProductName(product.getProductName());
		prdct.setProductDesc(product.getProductDesc());
		prdct.setProductImageUrl(product.getProductImageUrl());
		prdct.setQuantityAvail(product.getQuantityAvail());
		prdct.setProductCategory(product.getProductCategory());
		productRepo.save(prdct);
		return prdct.getProductId();
	}
	
	public List<Integer> saveAllProducts(List<RequestProductDTO> products){
		List<ProductModel> productList = new ArrayList<>();
		List<Integer> productIds = new ArrayList<>();
		for(RequestProductDTO product: products) {
			ProductModel prdct = new ProductModel();
			prdct.setProductName(product.getProductName());
			prdct.setProductDesc(product.getProductDesc());
			prdct.setProductImageUrl(product.getProductImageUrl());
			prdct.setQuantityAvail(product.getQuantityAvail());
			prdct.setProductCategory(product.getProductCategory());
			productList.add(prdct);
			productRepo.save(prdct);
			productIds.add(prdct.getProductId());
		}
		return productIds;
	}
}
