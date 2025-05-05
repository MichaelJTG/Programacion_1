package testingdao;

import javabeans.Location;
import negocio.ILocationDao;
import negocio.LocationDaoImplList;

public class TestLocDao {

	public static void main(String[] args) {
		ILocationDao iLocationDao = new LocationDaoImplList();
		
		for (Location ele: iLocationDao.findAll())
			System.out.println(ele);

	}

}
