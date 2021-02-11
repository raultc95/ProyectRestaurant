package Clases;


public class Drink extends Product{
	private boolean alcoholic;
	
	
	public Drink(int id, String name, double price, boolean forCeliac,boolean alcoholic) {
		super(id, name, price, forCeliac);
		this.alcoholic=alcoholic;
	}

	
	@Override
	public double getBundlePack(int id) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	

	public boolean isAlcoholic() {
		return alcoholic;
	}


	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}


	@Override
	public String getName(int id) {
		String result="null";
		result=this.name;
		return result;
	}

	@Override
	public double getPrice(int id) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public boolean getItsForCeliac(int id) {
		boolean result=false;
		return result;
	}
	
	

	@Override
	public String toString() {
		return "Drink ["+super.toString()+"  alcoholic= " + alcoholic + "]";
	}
	
	
}
