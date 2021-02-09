package Clases;

import java.util.UUID;

public class Drink extends Product{
	private boolean alcoholic;
	
	
	public Drink(String name, double price, boolean forCeliac,boolean alcoholic) {
		super(name, price, forCeliac);
		this.alcoholic=alcoholic;
	}

	@Override
	public double getBundlePack(UUID id) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public String getName(UUID id) {
		String result="null";
		result=this.name;
		return result;
	}

	@Override
	public double getPrice(UUID id) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public boolean getItsForCeliac(UUID id) {
		boolean result=false;
		return result;
	}
	
	public boolean isAlcoholicUU(UUID id) {
		boolean result=false;
		return result;
	}

}
