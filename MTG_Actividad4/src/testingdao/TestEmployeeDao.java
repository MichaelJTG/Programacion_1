package testingdao;

import javabeans.Employee;
import negocio.EmployeeDaoImplList;
import negocio.IEmployeeDao;

public class TestEmployeeDao {

	public static void main(String[] args) {
		IEmployeeDao iEmployeeDao = new EmployeeDaoImplList();
		
		for (Employee ele: iEmployeeDao.findAll())
			System.out.println(ele);

	}

}
