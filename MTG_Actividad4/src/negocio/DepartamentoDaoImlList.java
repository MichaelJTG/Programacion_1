package negocio;

import java.util.ArrayList;
import java.util.List;

import javabeans.Department;
import javabeans.Location;

public class DepartamentoDaoImlList implements IDepartmentDao{
	
	List<Department> lista;
	
	ILocationDao iLocationDao;
	
	public DepartamentoDaoImlList() {
			lista = new ArrayList<Department>();
		
			iLocationDao = new LocationDaoImplList();
		 
		cargarDatos();
	}
	public void cargarDatos() {
		lista.add(new Department(10, "Financiero", 102, iLocationDao.findById(1500)));
		lista.add(new Department(20, "Ventas", 201, iLocationDao.findById(1600)));
		lista.add(new Department(30, "Informática", 114, iLocationDao.findById(1700)));
		lista.add(new Department(40, "Programador", 201, iLocationDao.findById(1800)));
		
		
	}
	@Override
	public Department findById(Integer atributoPk) {
		for (Department ele: lista) {
			if (ele.getDepartmentId() == atributoPk)
				return ele;
		}
		return null;
	}
	@Override
	public int insertOne(Department objeto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateOne(Department objeto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteByObjeto(Department objeto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

}
