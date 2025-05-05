package testing;

import javabeans.Country;
import javabeans.Region;

public class TestCountry {

	public static void main(String[] args) {
		Region region1 = new Region(1, "Europa");
		Country esp = new Country("SP", "España", region1);
		Country arg = new Country("AR", "Argentina", new Region(2,"Sur América"));
		
		Region region2 = arg.getRegion();
		
		Country colombia = new Country("CO", "Colombia", arg.getRegion());
		
		System.out.println(region1);
		System.out.println(esp);
		System.out.println(arg);
		
		arg.setRegion(region1);
		
		
		System.out.println(arg);
		
		System.out.println("Nombre reg de españa : " + esp
													.getRegion()
													.getRegionName()
													.substring(0,3)
													.toUpperCase());
		
		
		
		
		

	}

}
