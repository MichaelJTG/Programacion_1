package test.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import modelo.dao.ClientesDao;
import modelo.dao.ClientesDaoImplXampJdbc;
import modelo.javabeans.Clientes;

public class testClientesDao {

	private static ClientesDao cdao;
	static {
		cdao = new ClientesDaoImplXampJdbc();
	}
	
	public static void main(String[] args) {
	
		//todos();
		//findById();
		//insert();
		//delete();
		//importar();
		//exportar();
		
	}
	public static void delete() {
		switch(cdao.eliminarUnCliente("A12345678")) {
		case 1:
			System.out.println("Eliminado");
			break;
		case 0:
			System.out.println("No existe");
			break;
		default:
			System.out.println("no puedes");
		}
		
	}
	
	public static void insert() {
		System.out.println("\ninsertar cliente\n");
		Clientes clientes = new Clientes("A12345678","Pop","eye","C/fantasia",23000f,21);
		System.out.println("Cliente insertado espero un 1 : "+ cdao.altaDelCliente(clientes));
		
		todos();
	}
	
	public static void findById() {
		System.out.println("\nUn Cliente\n");
		System.out.println("Este existe : "+ cdao.buscarUnCliente("A11111111"));
		System.out.println("Este NOOOO existe : "+ cdao.buscarUnCliente("A11111134"));
	}
	
	public static void todos() {
		
		System.out.println("\nListado de todos\n");
		ClientesDao cdao = new ClientesDaoImplXampJdbc();
		
		for (Clientes ele: cdao.FindAll())
			System.out.println(ele);
	}
	
	public static void exportar() {
		  // Ruta del fichero de exportación
        String nombreFichero = "d:/fichero/clientes.obj";
      
        // Ejecutamos la exportación
        String mensaje = cdao.exportar(nombreFichero);
        System.out.println("Mensaje de exportación: " + mensaje);
        
        // Ahora comprobamos leyendo el fichero
        try (
        		
        		FileInputStream fis = new FileInputStream(nombreFichero);
        		ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            System.out.println("Leyendo objetos desde el fichero exportado:");
            while (true) {
                try {
         
                    Clientes cliente = (Clientes) ois.readObject();
                    System.out.println(cliente);
                } catch (EOFException eof) {
                	System.out.println("Clientes bien exportados");
                    System.out.println("Fin del fichero");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
		System.out.println("Fichero no existe");
		
        }
        }
	
	public static void 	importar() {
		 String nombreFichero = "d:/fichero/clientes.obj";
		 List<Clientes> aux = cdao.importar(nombreFichero);
		 System.out.println("Cantidad de clientes importados: " + aux.size());
		 for (Clientes cliente : aux) {
	            System.out.println(cliente);
	}
	}
}
