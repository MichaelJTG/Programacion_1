package Ejecicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Leer números hasta que se introduzca un cero. Para cada uno indicar 
		 * si es par o impar. 
		 * Al final mostrar las siguientes Estadísticas:
            cuantos son pares e impares
            cuanto suman los pares y cuanto los impares.
           --------------------------------------------------------
        */
		Scanner leer = new Scanner(System.in);
		
		int num1 =0, contPares=0, contImpar=0, sumaPar=0, sumaImpar=0;
		
		System.out.println("Escribe -1 para terminar el programa");
		num1 = leer.nextInt();
		
		while(num1 != -1 ) {
			if(num1%2==0) {
				System.out.println("Es par");
				contPares++;
				sumaPar += num1;
		} else {
			    System.out.println("Es impar");
			    contImpar++;
			    sumaImpar += num1;
		}
			num1 = leer.nextInt();
		}
			
			
		
		System.out.println("ESTADISTICAS");
		System.out.println("Los numeros pares son un total de : "+ contPares);
		System.out.println("Los numeros impares son un total de  : "+ contImpar);
		System.out.println("El total de numeros pares suman : "+ sumaPar);
		System.out.println("El total de numeros impares suman  : "+ sumaImpar );
		
		leer.close();
		
		
		

				}
		}
	





