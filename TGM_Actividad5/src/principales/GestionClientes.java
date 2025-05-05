package principales;

import java.util.List;
import java.util.Scanner;


import modelo.dao.ClientesDao;
import modelo.dao.ClientesDaoImplXampJdbc;
import modelo.javabeans.Clientes;




public class GestionClientes {

	private static Scanner leer = new Scanner(System.in);
	private static ClientesDao cdao = new ClientesDaoImplXampJdbc();
	
	public static void main(String[] args) {
		
	        int opcion=0;
	        do {
	            opcion = pintarMenu();
	            switch(opcion)  {
	            	case 1:
	            		altaDelCliente();
                    break;
	                case 2:
	                	buscarUnCliente();
	                    break;
	                case 3:
	                 
	                	FindAll();
	                    break;
	                case 4:
	                    
	                	eliminarUnCliente();
	                    break;
	                case 5:
	                   
	                	exportar();
	                    break;
	                case 6:
	                    
	                	importar();
	                    break;
	                case 7: //Fin de Programa
	                    System.out.println("Fin Del Programa");
	            }

	        }while(opcion != 7);
	        // Mensaje de finalización del programa
	        System.out.println("Fin del programa");

	        // Cierre del Scanner
	        leer.close();
	    }
	
	
	
	private static void altaDelCliente() {
		System.out.println("Introduce tus datos para darte de alta\n");
		System.out.print("CIF: ");
		String cif = leer.next();
		System.out.print("Nombre: ");
		String nombre = leer.next();
		System.out.print("Apellidos: ");
		String apellidos = leer.next();
		System.out.print("Domicilio: ");
		String domicilio = leer.next();
		System.out.print("Facturación anual: ");
		float facturacion_anual = leer.nextFloat();
		System.out.print("Número de empleados: ");
		int numero_empleado = leer.nextInt();
		
		Clientes cliente = new Clientes(cif, nombre, apellidos, domicilio, facturacion_anual, numero_empleado);
		int alta = cdao.altaDelCliente(cliente);
		if (alta == 1) {
	        System.out.println("Alta confirmada");
	    } else {
	        System.out.println("Este contacto ya existe");   
	    }
		System.out.println("\n---------------\n");
	}

	



	private static void buscarUnCliente() {
		System.out.println("Dame tu cif");//A11111111 cif de prueba
		String cif = leer.next();
		Clientes cliente = cdao.buscarUnCliente(cif);
		if (cliente != null)
			System.out.println(cliente);
		else
			System.out.println("Este cif no existe");
			System.out.println("\n---------------\n");
	}



	private static void FindAll() {
		System.out.println("\nListado de todos\n");
		ClientesDao cdao = new ClientesDaoImplXampJdbc();
		
		for (Clientes ele: cdao.FindAll())
			System.out.println(ele);
		System.out.println("\n---------------\n");
	}



	private static void eliminarUnCliente() {
		System.out.print("CIF: ");
		String cif = leer.next();
		int baja = cdao.eliminarUnCliente(cif);
		if (baja == 1) {
	        System.out.println("Baja confirmada");
	    } else {
	        System.out.println("Este cif ya existe");
	    }
		System.out.println("\n---------------\n");
	}



	private static void exportar() {
		 System.out.print("Introduce el nombre del fichero (ej: d:/fichero/clientes.obj: ");
		    String nombreFichero = leer.next();

		    String resultado = cdao.exportar(nombreFichero);
		    System.out.println(resultado);
		    System.out.println("\n---------------\n");
	}



	private static void importar() {
		System.out.print("Introduce el nombre del fichero (ej: d:/fichero/clientes.obj: ");
	    String nombreFichero = leer.next();

	    List<Clientes> lista = cdao.importar(nombreFichero);
	    
	    if (lista.isEmpty()) {
	        System.out.println("Fichero vacio");
	    } else {
	        System.out.println("Datos del fichero importados:\n");
	        for (Clientes cliente : lista) {
	            System.out.println(cliente);
	        }
	    }System.out.println("\n---------------\n");
	}



	public static int pintarMenu() {
		int opcion = 0;
		System.out.println("1.- AltaDelCliente");
		System.out.println("2.- buscarUnCliente");
		System.out.println("3.- FindAll ");
		System.out.println("4.- eliminarUnCliente");
		System.out.println("5.- exportar");
		System.out.println("6.- importar");
		System.out.println("7.- Salir");
		
		System.out.println("Teclea una opcion, 7 para salir");
		
		opcion = leer.nextInt();
		while(opcion <1 || opcion > 7) {
			System.out.println("Opcion incorrecta, validos del 1 al 7");
			opcion= leer.nextInt();
		}
		
		return opcion;
	}
	
	}
	
	
	

	

