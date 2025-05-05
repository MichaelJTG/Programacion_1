package Ejecicios;

public class CorreccionDeEjer2 {

	public static void main(String[] args) {
	
int producto = 1, suma=0;
int impar = 1;
		
		for (int i=  1 ; i<=10; i++) {
			
			producto *= impar;
			suma += impar;
			
			impar += 2;
			
			
			
		}

		System.out.println("Estadisticas");
		System.out.println("la suma : " + suma);
		System.out.println("El producto es : " + producto);
	}
}


// Esta correcion el la forma antigua de hacerlo
		/*
		 * 	// contar los 10 primeros numeros impares
			
			int producto = 1, suma=0;
			
			for (int i=  1 ; i<=19; i+=2) {
				
				producto *= i;
				suma += i;
				
				
			}

			System.out.println("Estadisticas");
			System.out.println("la suma : " + suma);
			System.out.println("El producto es : " + producto);

		}

	}

		 */