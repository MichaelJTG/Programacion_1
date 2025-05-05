package negocio;

import java.util.List;

import javabeans.Employee;

public interface IEmployeeDao extends ICrudGenerico<Employee, Integer>{

	
	// Se adicionan los metodos de la UML proporcionada
	
	List<Employee> porDepartamento(int departmentId);	
    List<Employee> porTrabajo(String jobId); 
	double calcularMasaSalarial(); 
	double masaSalarialPorDep(int departmentId);
	List<Employee> fueraSalario(); 
		
	
}
