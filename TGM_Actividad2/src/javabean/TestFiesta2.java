package javabean;

public class TestFiesta2 {

	public static void main(String[] args) {
       //Creacion de fiesta usando el contructor con parametos
		
		Fiesta fiesta2 = new Fiesta("San valentin","C/ cuenca 89(Restaurante italiano)",4, 6, 4,"14/02/2025","17:01:01");
		
		System.out.println("Parametros iniciales de fiesta (4 invitados)");
		
		System.out.println("Tipo de fiesta : "+fiesta2.getTipoFiesta());
		System.out.println("Dirreccion de la fiesta : "+fiesta2.getDireccion());
		System.out.println("Inivitados inicialea : "+fiesta2.getInvitados());
		System.out.println("Bebidas : "+fiesta2.getBebidas());
		System.out.println("Bocadillos : "+fiesta2.getBocadillos());
		System.out.println("                                                        ");
		
		
		//Comprobacion de adicion y resta de invitados
		
				//Cancealcion de invitacion en 1
				fiesta2.cancelarInvitacion();
				System.out.println("Quitamos un invitado : " + fiesta2.getInvitados());
				System.out.println("                                                        ");
				
		        // Suma con sobrecarga de invitados 
				System.out.println("Sumamos 10 invitados : " + fiesta2.invitar(10));
				System.out.println("                                                        ");
		        
				// Resta con sobrecarga de invitados 
				System.out.println("Quitamos 8 invitado : " + fiesta2.cancelarInvitacion(8));
				System.out.println("                                                        ");
				
				//Suma de invitacion en 1
				fiesta2.invitar();
				System.out.println("invitamos a uno mas : " + fiesta2.getInvitados() );
				System.out.println("                                                        ");

				System.out.println(" - - - -[conclusion]- - - - - - ");
				System.out.println("                                                        ");
				System.out.println("Coste de la fiesta final " + fiesta2.precioFiesta() + ": euros ");
				
				//He intendado hacer que se vea todo en consola lo mas ordenado posible
				
		

	}

}
