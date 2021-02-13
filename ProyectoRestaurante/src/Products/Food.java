package Products;


public class Food extends Product {
	private boolean forVegans;

	public Food(int id, String name, double price, boolean forCeliac,boolean forVegans) {
		super(id, name, price, forCeliac);
		this.forVegans=forVegans;
	}

	@Override
	public double getBundlePack() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public boolean getItsForCeliac() {
		return this.forCeliac;
	}
	
	public boolean isForVegans() {
		return this.forVegans;
	}

	@Override
	public String toString() {
		return "Food ["+super.toString()+"  forVegans= " + forVegans + "]";
	}
	
}
