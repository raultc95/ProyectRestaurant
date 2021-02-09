package Interfacez;

import java.util.UUID;

public interface IProduct {
	double getBundlePack(UUID id );
	String getName(UUID id);
	double getPrice(UUID id);
	boolean getItsForCeliac(UUID id);
	
}
