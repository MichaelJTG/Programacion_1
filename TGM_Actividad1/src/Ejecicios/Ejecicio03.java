package Ejecicios;

public class Ejecicio03 {

	public static void main(String[] args) {
		/*Escribir todos los números del 100 al 0 de 7 en 7. Al final mostrar las 
		 * siguientes Estadísticas.
		 * Cuantos números has escrito
           Cuanto suman los números escritos
           Cuantos de estos números son pares.
		 */
       int cont = 0,contMult2 = 0,suma=0;
    		   
		
		for(int i = 100; i>= 0; i-=7) {
			System.out.println(i);
			if(i %2 == 0) 
				contMult2++;
			      suma += i;
			        cont++;		 
		}
		
		System.out.println("ESTADISTICAS");
		System.out.println("Numeros escritos : "+ cont);
		System.out.println("suma de numeros escritos : "+ suma);
		System.out.println("Cuantos de estos numeros son pares : "+ contMult2 );
		
		
	}

	}


