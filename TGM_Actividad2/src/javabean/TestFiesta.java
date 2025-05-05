package javabean;

public class TestFiesta {

	public static void main(String[] args) {
		
		Fiesta fiesta1 = new Fiesta();
	
		//Creacion de fiesta usando el constructor sin parametros
		
		fiesta1.setTipoFiesta("Disfrsces");
		fiesta1.setBebidas(8);
		fiesta1.setBocadillos(8);
		fiesta1.setDireccion("C/ tetuan 5, cafeteria valor ");
		fiesta1.setInvitados(6);
		fiesta1.setFecha("2 de diciembre de 2024");
		fiesta1.setHora("18:01:01");
		
		//Comprobacion de parametros de fiesta mas ToSTRING
		
		System.out.println("Parametros iniciales de fiesta (6 invitados)");
		System.out.println(fiesta1.toString());
		System.out.println("                                                        ");
		
		//Comprobacion de adicion y resta de invitados
		
		//Cancealcion de invitacion en 1
		fiesta1.cancelarInvitacion();
		System.out.println("Quitamos un invitado : " + fiesta1.getInvitados());
		System.out.println("                                                        ");
		
        // Suma con sobrecarga de invitados 
		System.out.println("Sumamos 10 invitados : " + fiesta1.invitar(10));
		System.out.println("                                                        ");
        
		// Resta con sobrecarga de invitados 
		System.out.println("Quitamos 8 invitado : " + fiesta1.cancelarInvitacion(8));
		System.out.println("                                                        ");
		
		//Suma de invitacion en 1
		fiesta1.invitar();
		System.out.println("invitamos a uno mas : " + fiesta1.getInvitados() );
		System.out.println("                                                        ");

		System.out.println(" - - -[Detalles finales de la fiesta de disfraces]- - - - - - ");
		System.out.println("                                                        ");
		
		System.out.println("Direccion : " + fiesta1.getDireccion());
		System.out.println("Numero de bocadillos necesarios : " + fiesta1.getBocadillos());
		System.out.println("Numero de bebidas necesarias : " + fiesta1.getBebidas());
		System.out.println("                                                        ");
		System.out.println(" - - - -[conclusion]- - - - - - ");
		System.out.println("                                                        ");
		System.out.println("Coste de la fiesta final " + fiesta1.precioFiesta() + ": euros ");
		
		//He intendado hacer que se vea todo en consola lo mas ordenado posible
		
		
		
		
		
		
		
		
		
		
		/*Creacion de fiesta usando el contructor con parametos
		
		Fiesta fiesta2 = new Fiesta("San valentin","Restaurante italino",4, 6, 4,"14/02/2025","17:01:01");
		
		*/
		
		/*
		//Descripcion de la fiesta 1 + el precio total poner solo 3 opciones
		
		System.out.println(fiesta1.toString());
		
		
		
		// desgose de la fiesta 2 + el precio total poner solo 3 opciones
		
		System.out.println(fiesta2.toString());
		System.out.println(fiesta2.precioFiesta());
		*/
		
	}

}
