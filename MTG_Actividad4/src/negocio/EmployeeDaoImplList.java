package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javabeans.Department;
import javabeans.Employee;

public class EmployeeDaoImplList implements IEmployeeDao{
	
	private List<Employee> lista;
	private IJobDao iJobDao;
	private IDepartmentDao iDepartmentDao;
	
	public EmployeeDaoImplList() {
		lista = new ArrayList<Employee>();
		iJobDao = new JobDaoImplList();
		iDepartmentDao = new DepartamentoDaoImlList();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1998, 4, 15)
						,iJobDao.findById("IT_PROG"), 35_000, 0.2,  iDepartmentDao.findById(30)));
		
		lista.add(new Employee(115, "Ana", "Koo", "ana@fp.com", "678678555", LocalDate.of(1997, 11, 15),
				iJobDao.findById("IT_PROG"), 30_000, 0.1,  iDepartmentDao.findById(30)));
	
		
		/**
		* Adicion de nuevos datos para los test de actividad
		*/
		
		//Sujeto de prueba de "porDepartamento,fueraSalario"
		lista.add(new Employee(60, "juana", "perez", "juanaP@fp.com", "987403982", LocalDate.of(1989, 2, 2),
		iJobDao.findById("IT_PROG"), 58_000, 0.1,  iDepartmentDao.findById(10)));
		lista.add(new Employee(115, "Sandra", "salamandra", "Sandra@fp.com", "875639837", LocalDate.of(1998, 4, 12),
		iJobDao.findById("IT_PROG"), 19_000, 0.1,  iDepartmentDao.findById(10)));
		
		//Sujeto de prueba de "porTrabajo"
		lista.add(new Employee(115, "Juan", "Gomez", "Juan@fp.com", "749374343", LocalDate.of(1969, 11, 28),
		iJobDao.findById("JF_PROY"),470_000 , 0.1,  iDepartmentDao.findById(20)));
		lista.add(new Employee(115, "Jose", "Cebolla", "JoCE@fp.com", "764578321", LocalDate.of(1959, 3, 1),
		iJobDao.findById("JF_PROY"), 369_000, 0.1,  iDepartmentDao.findById(20)));
		
		//calcularMasaSalarial
		lista.add(new Employee(115, "pepe", "Koo", "pepko@fp.com", "756583733", LocalDate.of(1997, 11, 15),
		iJobDao.findById("IT_PROG"), 12_000, 0.1,  iDepartmentDao.findById(20)));
		
	}

	@Override
	public Employee findById(Integer atributoPk) {
		for (Employee ele: lista) {
			if (ele.getEmployeeId() == atributoPk)
				return ele;
		}
		return null;
	}
	
	

	@Override
	public int insertOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByObjeto(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	
	/**
	 * Creacion de metodos proporcionados
	 */

	@Override//lista me dan un int comparo con == y retorno una lista
	public List<Employee> porDepartamento(int departmentId) {
		List<Employee> aux = new ArrayList<Employee>();
		
		for(Employee employee:lista) {
			if(employee.getDepartment() != null && employee.getDepartment()
			.getDepartmentId()==departmentId)
				aux.add(employee);
		
		}return aux;
		
	}

	@Override
	public List<Employee> porTrabajo(String jobId) {
		List<Employee> aux = new ArrayList<Employee>();
		
		for(Employee employee:lista) {
			
		    if(employee.getJob().getJobId().equals(jobId)) 
			   aux.add(employee);
			
		}
		return aux;
	}

	@Override //no me dan nada comparo datos ya existentes 
	public double calcularMasaSalarial() {
		List<Employee> aux = new ArrayList<Employee>();
		double masaSalarial =0;
		for(Employee employee:lista) {
			masaSalarial += employee.getSalary();
			aux.add(employee);
		}

		return masaSalarial;
	}

	@Override
	public double masaSalarialPorDep(int departmentId) {
		List<Employee> aux = new ArrayList<Employee>();
		double masaSalarialDep =0;
		for(Employee employee:lista) {
			if(employee.getDepartment()
			.getDepartmentId()==departmentId) {
				masaSalarialDep += employee.getSalary();
			}
		
		}
		return masaSalarialDep;
	}

	@Override
	public List<Employee> fueraSalario() {
		List<Employee> aux = new ArrayList<Employee>();
		
		for(Employee employee: lista) {
			
			if(employee.getJob().getMinSalary() < employee.getJob().getMaxSalary() ||
					(employee.getJob().getMaxSalary() > employee.getJob().getMinSalary()))
				aux.add(employee);
	
		}
		
		return aux;
	}
	
	
	
	

}
