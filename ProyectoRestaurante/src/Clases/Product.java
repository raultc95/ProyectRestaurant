package Clases;

import Interfacez.IProduct;

abstract public class Product implements IProduct {
	protected int id;
	protected String name;
	protected double price;
	protected boolean forCeliac;
	
	
	public int getId() {
		return id;
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
	
	public Product(int id, String name, double price, boolean forCeliac) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.forCeliac = forCeliac;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", price=" + price + ", forCeliac=" + forCeliac ;
	}
	
	
	
	
	

}
