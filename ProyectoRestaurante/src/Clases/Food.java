package Clases;

public class Food extends Product {
	private boolean forVegans;

	public Food(int id, String name, double price, boolean forCeliac,boolean forVegans) {
		super(id, name, price, forCeliac);
		this.forVegans=forVegans;
	}

	@Override
	public double getBundlePack(int id) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public String getName(int id ) {
		// TODO Apéndice de método generado automáticamente
		return null;
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
	public boolean isForVegans(int id) {
		boolean result=false;
		return result;
	}

	@Override
	public String toString() {
		return "Food ["+super.toString()+"forVegans=" + forVegans + "]";
	}
	
}
