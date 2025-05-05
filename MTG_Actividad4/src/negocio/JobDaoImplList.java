package negocio;

import java.util.ArrayList;
import java.util.List;

import javabeans.Department;
import javabeans.Job;

/*
 * explicacion linea por linea
 * */

public class JobDaoImplList implements IJobDao{ // en esta linea debemos implementar el DAO
	
	private List<Job> lista;// creamos la variable que es una lista donde se almacenara nuestros datos
	
	
	public JobDaoImplList() {         // creacion del constructor
		lista = new ArrayList<Job>(); //lista
		cargarDatos();//carga de datos
	}
	
	public void cargarDatos() {//metodo de la carga de datos mas los datos
		lista.add(new Job("IT_PROG", "Programador",20000, 38000));
		lista.add(new Job("JF_PROY", "jefe proyecto",35000, 80000));
		lista.add(new Job("AD_PRESS", "Presidente",120000, 380000));
		
		
	}

	@Override
	public Job findById(String atributoPk) {		//primer metodo misma base (FindById)
		for (Job ele: lista) {						//for de "jobs" que alamacena "ele" y es una "lista"
			if (ele.getJobId().equals(atributoPk))	/*if comparamos lo que almacena "ele" en este caso String Con 
													.quals(metemos lo que quermos compara)*/
				return ele;							/*si la comparacion es correcta de "ele" mas lo que nos pasan
													return "ele"*/
		}
		return null;								//sino retornamos null;
	}

	@Override
	public int insertOne(Job objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Job objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByObjeto(Job objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Job> findAll() { //metodo para mostrar por consola todos los dato
		// TODO Auto-generated method stub
		return lista;//simplemente devuelve lista
	}

}
