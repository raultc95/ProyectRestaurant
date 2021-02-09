package Clases;

import java.util.UUID;

import Interfacez.IProduct;

abstract public class Product implements IProduct {
	protected UUID id;
	protected String name;
	protected double price;
	protected boolean forCeliac;
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isForCeliac() {
		return forCeliac;
	}
	public void setForCeliac(boolean forCeliac) {
		this.forCeliac = forCeliac;
	}
	
	public Product(String name, double price, boolean forCeliac) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.price = price;
		this.forCeliac = forCeliac;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", price=" + price + ", forCeliac=" + forCeliac + "]";
	}
	
	
	
	
	

}
