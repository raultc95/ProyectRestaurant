import Clases.Repository;

public class Index {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Repository carta=new Repository();
		carta.getAllProducts();//.forEach(p->System.out.println(p));
		System.out.println("");
		System.out.println(""+carta.searchDrinks("Fanta"));

		//carta.getAllAlcoholicsDrinks().forEach(p->System.out.println(p));

			
	}

	

}
