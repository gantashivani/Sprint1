package com.capgemini.go.dto;

public class WishListDTO {

	
	private int userId;
	private int RegisterId;
	private int productId;
	private  int wishListId;
	
	private ProductsDTO products;
	
	public WishListDTO() {
	}
	
	
	public WishListDTO(int userId, int registerId, int productId, int wishListId) {
		super();
		this.userId = userId;
		RegisterId = registerId;
		this.productId = productId;
		this.wishListId = wishListId;
	}

	public ProductsDTO getProducts() {
		return products;
	}


	public void setProducts(ProductsDTO products) {
		this.products = products;
	}


	public int getWishListId() {
		return wishListId;
	}


	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
	}


	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRegisterId() {
		return RegisterId;
	}
	
	public void setRegisterId(int registerId) {
		RegisterId = registerId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}


	@Override
	public String toString() {
		return "WishListDTO [userId=" + userId + ", RegisterId=" + RegisterId + ", productId=" + productId
				+ ", wishListId=" + wishListId + ", products=" +  "\n RetailerId ProductId   Prize	 Color	  Dimensions	 Specifications	  Manufacturer quantity productCatogery productName \n"+products;
	}
	
}
