package com.capgemini.go.dto;

public class ProductsDTO {

	
	private int retailerId;
	private int productId;
	private float prize;
	private String color;
	private int dimensions;
	private String specifications;
	private String manufacturer;
	private int quantity;
	private int productCatogery;
	private String productName;
	
	
	public ProductsDTO(int retailerId,int productId, float prize, String color, int dimensions, String specifications,
			String manufacturer, int quantity, int productCatogery, String productName) {
		super();
		this.retailerId = retailerId;
		this.productId = productId;
		this.prize = prize;
		this.color = color;
		this.dimensions = dimensions;
		this.specifications = specifications;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.productCatogery = productCatogery;
		this.productName = productName;
	}
	
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDimensions() {
		return dimensions;
	}
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductCatogery() {
		return productCatogery;
	}
	public void setProductCatogery(int productCatogery) {
		this.productCatogery = productCatogery;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return  retailerId + "         " + productId + "      " + prize + "     "
				+ color + "         " + dimensions + "     " + specifications + "    "
				+ manufacturer + "    " + quantity + "     " + productCatogery + "    "
				+ productName;
	}
}
