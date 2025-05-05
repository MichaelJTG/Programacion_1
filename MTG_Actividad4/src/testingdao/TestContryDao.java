package testingdao;

import javabeans.Country;
import javabeans.Region;
import negocio.CountryDaoImplList;
import negocio.ICountryDao;
import negocio.IRegionDao;
import negocio.RegionDaoImplList;

public class TestContryDao {
	
	private static ICountryDao iCountryDao;
	private static IRegionDao  iRegionDao;
	private static int cont;
	
	static {
		iCountryDao = new CountryDaoImplList();
		iRegionDao = new RegionDaoImplList();
		cont = 0;
	}

	public static void main(String[] args) {

	//	todos();
	//	porRegion();
	//	empezandoCon();
		alta();
		
		System.out.println("\nFIN DE PROGRAMA");
	}
	
	public  static void alta() {
		Country country = new Country("BR", "Brasil", iRegionDao.findById(4)); 
		System.out.println("resultado del alta del pais - 1 : " + iCountryDao.insertOne(country));
		System.out.println("resultado del alta del pais - 0 : " + iCountryDao.insertOne(country));
		todos();
		
	}
	
	public static void todos() {
		System.out.println("\nBUSCAR TODOS\n");
		
		for (Country country: iCountryDao.findAll())
			System.out.println(country);
	}
	
	public static void porRegion() {
		System.out.println("\nBUSCAR POR REGION\n");
		
		cont = 0;	
		int regionId=4;
		Region region = iRegionDao.findById(regionId);
		
		if (region == null) {
			System.out.println("Esta region no existe");
		}else {
		
			for (Country country: iCountryDao.buscarPorRegion(regionId)) {
				System.out.println(country);
				cont++;
				
			}
			if (cont == 0)
				System.out.println("No hay paises de esta region");
		}
	}
	
	public static void empezandoCon() {
		System.out.println("\nBUSCAR POR Empezando con\n");
		
		cont = 0;	
		String cadena="A";
		
		for (Country country: iCountryDao.buscarEmpezandoConName(cadena)) {
			System.out.println(country);
			cont++;
			
		}
		if (cont == 0)
			System.out.println("No hay paises de esta consulta");
	}

}
