package Ejecicios;

import java.util.Scanner;

public class Ejecicio05 {

	public static void main(String[] args) {
		/*
		 * Pedimos por pantalla un nombre y una contraseña: si el nombre coincide con
		 * “sara”, preguntamos por la contraseña y si coincide con “sarita”, escribimos
		 * el mensaje “usuario y contraseña correctas, bienvenido a la aplicación” Si el
		 * nombre NO es “sara” Escribimos usuario incorrecto” Si el nombre es correcto y
		 * la contraseña NO, Escribimos “contraseña incorrecta”
		 */
		Scanner leer = new Scanner(System.in);

		String usuario = "sara";
		String contraseña = "sarita";
		
		System.out.println("Escribe tu usuario");
		usuario = leer.nextLine();
		//empezamos con variable usuario
		if(usuario.equals("sara")){
			System.out.println("Usuario correcto");
			//primera pregunt
		} else {
			System.out.println("usuario incorrecto");
		}//fin pregunt
			System.out.println("Escribe la contraseña");
			contraseña = leer.nextLine();
			//empezamos con variable contraseña
			
				if(usuario.equals("sara") && (contraseña.equals("sarita"))) {
		System.out.println("contraseña correcta");
		System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");
				 	/*segunda pregunta comparamos resultados de ambos String con(&&)para 
				 	 * dar acceso a la aplicacion
				 	*/
				 	
			} else { 
				System.out.println("Contraseña incorrecto");
				System.out.println("usuario o contraseña incorrectas");
			}//fin segunda pregunta
				/*
				  Gracias por el ejercicio aprendi sobre la comparacion de String 
				  con equals y el uso de {} para separa preguntas para finalizar 
				  donde lo necesito ademas del pocicionamiento correcto del Syso 
				  al momento de mostrar en pantalla. gracias
				*/
	    
		
		
		
		leer.close();
		
		
		
		
		
		
		
		
	}
	
	
}


		
		
		
	

	

