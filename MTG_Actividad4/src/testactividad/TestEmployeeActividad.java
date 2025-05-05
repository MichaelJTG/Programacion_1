package testactividad;

import java.util.List;

import javabeans.Country;
import javabeans.Department;
import javabeans.Employee;
import javabeans.Region;
import negocio.DepartamentoDaoImlList;
import negocio.EmployeeDaoImplList;
import negocio.IDepartmentDao;
import negocio.IEmployeeDao;

public class TestEmployeeActividad {

	public static void main(String[] args) {
		
		/**
		 * porDepartamento
		 * porTrabajo
		 * calcularMasaSalarial
		 * masaSalarialPorDep
		 * fueraSalario
		 * 
		 */
		
		
        ///porTrabajo
		IEmployeeDao iEmployeeDao = new EmployeeDaoImplList();
		
		System.out.println("\nPor_Trabajo");
		
		String cadena ="JF_PROY";
		
		      for (Employee employee: iEmployeeDao.porTrabajo(cadena))
		    	  System.out.println( "Nombre : "+employee.getFirstName()  + " " +"Trabajo : "+employee.getJob().getJobId());
		
		/// calcularMasaSalarial
		IEmployeeDao iEmployeeDao1 = new EmployeeDaoImplList();
		System.out.println("\nCalcular masa salarial");
		
		double masaSalarial = iEmployeeDao1.calcularMasaSalarial();
		System.out.println("Resultado : " + masaSalarial);
		
		//masaSalarialPorDep
		      
		IEmployeeDao iEmployeeDao2 = new EmployeeDaoImplList();
		System.out.println("\nCalcular masa salarial por Departamento");
		
		int dep = 20;
		double masaSalarialDep = iEmployeeDao2.masaSalarialPorDep(dep);
		System.out.println("Resultado : " + masaSalarialDep);
		
		//fueraSalario
		IEmployeeDao iEmployeeDao3 = new EmployeeDaoImplList();
		System.out.println("\nFuera de salario");
		
		List<Employee> fueraDeSalario = iEmployeeDao3.fueraSalario();
		     
		    	for(Employee employee: fueraDeSalario) {
		    		System.out.println("trabajadores fuera de salario: " + 
		    	employee.getFirstName()+ " " + employee.getSalary());
		    	}
		
		
		//porDepartamento
		IEmployeeDao iEmployeeDao4 = new EmployeeDaoImplList();
		IDepartmentDao iDeparmentDao = new DepartamentoDaoImlList();
		
		System.out.println("Pueba de metodos de employee");
		
		Department department = iDeparmentDao.findById(10);
		
		if (department == null) {
			System.out.println("Esta region no existe");
			
		}else {
			
			for (Employee employee: iEmployeeDao4.porDepartamento(10))
				System.out.println(employee.getDepartment().getDepartmentId() +" "+ employee.getDepartment().getDepartmentName());
			    
			
	}
}
}
