package Products;


public class Drink extends Product{
	private boolean alcoholic;
	
	
	public Drink(int id, String name, double price, boolean forCeliac,boolean alcoholic) {
		super(id, name, price, forCeliac);
		this.alcoholic=alcoholic;
	}

	
	@Override
	public double getBundlePack() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	

	public boolean isAlcoholic() {
		return alcoholic;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
	
		return this.price;
	}

	@Override
	public boolean getItsForCeliac() {
		boolean result=false;
		return result;
	}
	
	

	@Override
	public String toString() {
		return "Drink ["+super.toString()+"  alcoholic= " + alcoholic + "]";
	}
	
	
}
