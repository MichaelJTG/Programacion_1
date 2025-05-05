package negocio;

import java.util.List;

import javabeans.Location;

public interface ILocationDao extends ICrudGenerico<Location, Integer>{
	
	// Se adicionan los metodos de la UML proporcionada

	List<Location> buscarPorCity(String city);
	List<Location> buscarPorPostalCode(String postalCode);
	List<Location> buscarPorPais(String countryId);
	
	
}

