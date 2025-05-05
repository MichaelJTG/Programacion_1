package negocio;

import java.util.ArrayList;
import java.util.List;

import javabeans.Country;
import javabeans.Location;

public class LocationDaoImplList implements ILocationDao{
	
	private List<Location> lista;
	private ICountryDao iCountryDao;
	
	public LocationDaoImplList() {
		lista = new ArrayList<Location>();
		
		iCountryDao = new CountryDaoImplList();
		 
		cargarDatos();
	}
	
	private void cargarDatos() {
		
		lista.add(new Location(1500, "del pez3", "28007", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1600, "del nuez 3", "28017", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1700, "del rosa 23", "19002", "Guadalajara", "Guadalajara", iCountryDao.findById("ES")));
		
		//sujeto de prueba de buscarPorCity valencia
		lista.add(new Location(2090, "C/ cortina", "46009", "Valencia","Torrent", iCountryDao.findById("ES")));
		lista.add(new Location(2090, "C/ salero", "46019", "Valencia","xirivella", iCountryDao.findById("ES")));
		//sujeto de prueba de buscarPorPostalCode 46018
		lista.add(new Location(8769, "Av.zapato", "46018", "Granada", "Granada", iCountryDao.findById("ES")));
		lista.add(new Location(8769, "Av.tecla", "46018", "Granada", "Granada", iCountryDao.findById("ES")));
		//sujeto de prueba de buscarPorPais rue mazarin
		lista.add(new Location(64500, "Rue Mazarin", "64600", "Saint-jean-de-Luz", "Saint-jean-de-Luz", iCountryDao.findById("FR")));
		lista.add(new Location(64500, "Rue rin", "64600", "Saint-jean-de-Luz", "Saint-jean-de-Luz", iCountryDao.findById("FR")));

	}

		
		
	

	@Override
	public Location findById(Integer atributoPk) {
		for (Location ele: lista) {
			if (ele.getLocationId() == atributoPk)
				return ele;
		}
		return null;
	}

	@Override
	public int insertOne(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByObjeto(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	
	/*
	 * Creacion de metodos proporcionados
	 */

	@Override //comparacion, nos dan un string(equal) y devolvemos una lista aux
	public List<Location> buscarPorCity(String city) {
		List<Location> aux = new ArrayList<Location>();
		
		for(Location location: lista) {
			if(location.getCity().equals(city))
					aux.add(location);
		}
		
		return aux;
	}

	@Override
	public List<Location> buscarPorPostalCode(String postalCode) {
		List<Location> aux = new ArrayList<Location>();
		
		for(Location location: lista) {
			if(location.getPostalCode().equals(postalCode))
				aux.add(location);
		}
		return aux;
	}

	@Override
	public List<Location> buscarPorPais(String countryId) {
		List<Location> aux = new ArrayList<Location>();
		
		for(Location location: lista) {
			if(location.getCountry().getCountryId().equals(countryId))
				aux.add(location);
		}
		
		return aux;
	}

}
