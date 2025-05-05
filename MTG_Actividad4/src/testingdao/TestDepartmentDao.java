package testingdao;

import javabeans.Department;
import negocio.DepartamentoDaoImlList;
import negocio.IDepartmentDao;

public class TestDepartmentDao {

	public static void main(String[] args) {
		IDepartmentDao iDepartmentDao = new DepartamentoDaoImlList();
		
		for (Department ele : iDepartmentDao.findAll())
			System.out.println(ele);

	}

}
