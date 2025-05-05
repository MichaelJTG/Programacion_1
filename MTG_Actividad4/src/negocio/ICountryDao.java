package negocio;

import java.util.List;

import javabeans.Country;

public interface ICountryDao extends ICrudGenerico<Country, String>{
	
	List<Country> buscarPorRegion(int regionId);
	List<Country> buscarEmpezandoConName(String subcadena);
	

}
