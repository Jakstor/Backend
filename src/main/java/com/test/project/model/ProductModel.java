package com.test.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="products")
public class ProductModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prdct_id", columnDefinition = "serial")
	private Integer productId;
	
	@Column(name ="prdct_nm")
	private String productName;
	
	@Column(name ="qunt_avil")
	private Integer quantityAvail;
	
	@Column(name ="prdct_img_url")
	private String productImageUrl;
	
	@Column(name ="prdct_desc")
	private String productDesc;
	
	@Column(name= "prdct_ctgry")
	private String productCategory;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantityAvail() {
		return quantityAvail;
	}

	public void setQuantityAvail(Integer quantityAvail) {
		this.quantityAvail = quantityAvail;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	
}
