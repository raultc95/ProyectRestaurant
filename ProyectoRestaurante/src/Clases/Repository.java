package Clases;

import java.util.ArrayList;
import java.util.List;

import Interfacez.IProduct;

public class Repository {
		private List<Product> carta=new ArrayList<>();

		public Repository() {
			carta.add(new Drink(1,"Fanta", 1.2, true, false));
			carta.add(new Drink(2,"Raddler", 1.1, true, true));
			carta.add(new Drink(3,"Agua", 0.8, true, false));
			carta.add(new Food(4,"Durum", 1, false, false));
			carta.add(new Food(5,"Pizza Vegana", 5, true, true));
			carta.add(new Food(6,"Kebah", 1.5, true, false));
			
		
		}

		
		  public void getAllProducts() {
			  for (Product item : carta) {System.out.println(item);}
		  }
	
		  public List<IProduct> getAllDrinks() {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public List<IProduct> getAllFoods() {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public List<IProduct> getAllNoAlcoholicDrinks() {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public List<IProduct> getAllAlcoholicsDrinks() {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public List<IProduct> getAllForVeganFood() {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public List<IProduct> getBundleProducts(IProduct Producto) {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public IProduct searchProduct(String name) {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public Drink searchDrinks(String name) {
		    // TODO Auto-generated method stub
		    return null;
		  }
	
		  public Food searchFoods(String name) {
		    // TODO Auto-generated method stub
		    return null;
		  }


		@Override
		public String toString() {
			return "Repository [carta=" + carta + "]";
		}
	
		  
		
	
	
}
