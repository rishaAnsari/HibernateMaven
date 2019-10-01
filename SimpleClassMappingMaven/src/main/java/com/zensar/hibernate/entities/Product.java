package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Risha Ansari
 * @creation_date 1 october 2019 10.12am
 * @modification_date 1 october 2019 10.12am
 * @version 1.0
 * @copyright Zensar technologies
 * @description It is an entity class
 *
 */
@Entity
public class Product {
	@Id
	@Column(name="id")
	private int productId;
	private String brand;
	private String productName;
	private int price;
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", productName=" + productName + ", price="
				+ price + "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
