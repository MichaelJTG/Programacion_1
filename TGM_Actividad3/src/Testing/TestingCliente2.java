package Testing;

import java.time.LocalDate;
import java.util.ArrayList;

import javabeans.Banco;
import javabeans.Cliente;
import javabeans.Cliente2;
import javabeans.DireccionCliente;
import javabeans.Pais;

import javabeans.TarjetaBancaria;

/*
 * 2.- Crear una clase Cliente, en el mismo paqute denominado Cliente2, con los mismos
   atributos de Cliente anterior, pero en lugar de tener un atributo con una Tarjeta, tenga una
   Lista de objetos de la clase Tarjeta.
   
   Y un Test para probar:
   - Una lista de las tarjetas de un cliente que construimos en memoria (copiar objetos del
   supuesto 1).
    Y para cada tarjeta sacar el banco de cada tarjeta, y el país del Banco de cada tarjeta.

 */
public class TestingCliente2 {

	public static void main(String[] args) {
		         /*
		          * Una lista de las tarjetas de un cliente que construimos en memoria (copiar objetos del
		          *  supuesto 1).
		          */
				  
		        //Dos objetos de la clase País.
				Pais pais1 = new Pais(20, "Spain");
				Pais pais2 = new Pais(25, "france");
				
				// Dos objetos de Banco, uno de cada País.
				Banco banco1 = new Banco(20113, "Santander", pais1);
				Banco banco2 = new Banco(25114, "Banque de France", pais2);
				
				//Dos tarjetas una de cada banco.
				TarjetaBancaria tarjetabancaria1 = new TarjetaBancaria(98746583, 2027, 12, 456,
						"Ramon Baldes garcia", banco1);
				
				TarjetaBancaria tarjetabancaria2 = new TarjetaBancaria(58323738, 2025, 6, 985,
						" Jean martin Bernard", banco2);
				
				
				//Una dirección.
				DireccionCliente direccioncliente = new DireccionCliente("calle Padre alberto 5",
						"Murcia", "Comunidad valenciana", pais1);
				
				//Un cliente con su tarjeta y su dirección.
				Cliente2 cliente = new Cliente2("A9012", "Ramon Baldes Garcia", 
						                      "RambalGracia@gamil.com", LocalDate.of(2020, 5, 14),
						                       direccioncliente,null);
				Cliente2 cliente1 = new Cliente2("9843f", "javier molina", "JMolina@gmail.com",
						                        LocalDate.of(2020, 4, 23), direccioncliente, null);
				
				
			//Y para cada tarjeta sacar el banco de cada tarjeta, y el país del Banco de cada tarjeta.
		        
				ArrayList<TarjetaBancaria> lista = new ArrayList<TarjetaBancaria>();
		        lista.add(tarjetabancaria2);
		        lista.add(tarjetabancaria1);
		        
		        cliente.setTarjetas(lista);
		        
		        System.out.println("Banco de cada tarjeta");
		        
		        for (TarjetaBancaria tarjetabancaria: cliente.getTarjetas()) {
		        
		        System.out.println("Nombre del banco : " + tarjetabancaria.getBanco()
		                                                                  .getNombre());
		        
		
		        System.out.println("Pais del banco : " +  tarjetabancaria.getBanco()
                                                                         .getPaisOpera()
                                                                         .getNombre());                                                     
		        
              
		
		
		
	}
		}
	}


