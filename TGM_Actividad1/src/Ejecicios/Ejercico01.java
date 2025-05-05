package Ejecicios;

import java.util.Scanner;

public class Ejercico01 {

	public static void main(String[] args) {
		/*
		 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, 
		 * Suficiente, Bien, Notable y sobresaliente. Si la nota introducida no   
		   está en el rango mostrar el mensaje “Nota errónea”.
		  */
		Scanner leer = new Scanner(System.in);
		
		int nota = 0 ;
		System.out.println("Dame tu nota");
		nota = leer.nextInt();
		
		switch (nota) {
		case 0,1,2:
			System.out.println( "Insuficiente");
		System.out.println("FIN DE PROGRAMA");
		break;
		
		case 3,4:
			System.out.println("suficiente");
		System.out.println("FIN DE PROGRAMA");
		break;
		
		case 5,6:
			System.out.println("Bien");
		System.out.println("FIN DE PROGRAMA");
		break;
		
		case 7,8:
			System.out.println("Notable");
		System.out.println("FIN DE PROGRAMA");
		break;
		
		case 9,10:
			System.out.println("Sobresaliente");
		System.out.println("FIN DE PROGRAMA");
		break;
		
		default:
			System.out.println("Nota errónea");
			System.out.println("FIN DE PROGRAMA");
			
			leer.close();
			// El mismo programa me recomendo cerrar el Scanner

			
			
		
			
			
		}
		
		
		}
		}

	


