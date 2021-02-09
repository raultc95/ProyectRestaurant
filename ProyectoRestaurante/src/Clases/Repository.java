package Clases;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	public static void main(String[] args) {
		List<Product> carta=new ArrayList<>();
		
		
		carta.add(new Drink("Coca-cola", 1.2, true, false));
		System.out.println(carta);
	}
	
	
}
