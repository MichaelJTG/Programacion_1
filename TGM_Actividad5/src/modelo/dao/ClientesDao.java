package modelo.dao;

import java.util.List;

import modelo.javabeans.Clientes;

public interface ClientesDao {
	
	int altaDelCliente(Clientes cliente);
	Clientes buscarUnCliente (String cif);
	List<Clientes>FindAll();
	int eliminarUnCliente(String cif);
	String exportar(String nombreFichero);
	List<Clientes> importar(String nombreFichero);
}
