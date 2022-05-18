package com.test.project.dto;

public class RequestProductDTO {

	private String productName;
	private Integer quantityAvail;
	private String productImageUrl;
	private String productDesc;
	private String productCategory;
	
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
