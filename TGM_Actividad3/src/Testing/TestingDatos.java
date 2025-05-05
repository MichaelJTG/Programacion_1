package testing;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javabeans.Banco;
import javabeans.Cliente;
import javabeans.DireccionCliente;
import javabeans.Factura;
import javabeans.Pais;
import javabeans.Pedido;
import javabeans.TarjetaBancaria;

public class TestingDatos {
	/*
	 -  Dos objetos de la clase País
     -  Dos objetos de Banco, uno de cada País.
     -  Dos tarjetas una de cada banco.
     -  Una dirección.
     -  Un cliente con su tarjeta y su dirección.
     -  Un Pedido con su cliente
     -  y una Factura con su Pedido
	 */

	public static void main(String[] args) {
		
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
		Cliente cliente = new Cliente("A9012", "Ramon Baldes Garcia", 
				                      "RambalGracia@gamil.com", LocalDate.of(2020, 5, 14),
				                       direccioncliente, tarjetabancaria1);
		
		//Un Pedido con su cliente.
		Pedido pedido = new Pedido(1456, LocalDate.of(2021, 6, 12), "En preparacion", cliente);
		
		//Una Factura con su Pedido.
		Factura factura = new Factura("0AH0", "Laptop lenovo", LocalDate.of(2021, 6, 12), pedido);
		
		/*
		 * Y ahora obtener mediante la variable de Factura creada la siguiente información (con syso):
         - La descripción de la Factura
         - La fecha y el estado del pedido
         - El nombre del cliente de ese pedido de esa factura
         - La dirección del cliente del pedido de la factura
         - El número de tarjeta del cliente del pedido de la factura
         - El nombre del titular de la tarjeta del cliente del pedido de la factura
         - El nombre del banco de la tarjeta del cliente del pedido de la factura
         - El país del banco de la tarjeta del cliente del pedido de la factura
         - El país de la dirección del cliente del pedido de la factura
		 */
		
		//La descripción de la Factura.(Laptop lenovo)
		System.out.println("\n---La descripción de la Factura---\n ");
		System.out.println(factura.getDescripcion());
		
		// La fecha y el estado del pedido.(2021-06-12,En preparacion)
		System.out.println("\n---La fecha y el estado del pedido---\n" );
		System.out.println("Fecha :  "+ pedido.getCreateAt());
		System.out.println("Estado :  "+ pedido.getEstado());
		
		// El nombre del cliente de ese pedido de esa factura(Ramon Baldes Garcia)
		System.out.println("\n--El nombre del cliente de ese pedido de esa factura--\n" );
		System.out.println("Nombre : " + factura.getPedido()
		                                        .getCliente()
		                                        .getNombre());
		
		//La dirección del cliente del pedido de la factura(calle Padre alberto 5)

		System.out.println("\n--La dirección del cliente del pedido de la factura---\n" );
		System.out.println("Direccion : " + factura.getPedido()
		                                           .getCliente()
		                                           .getDireccion()
		                                           .getDireccion());
		
		//El número de tarjeta del cliente del pedido de la factura(98746583)
		System.out.println("\n--El número de tarjeta del cliente del pedido de la factura---\n" );
		System.out.println("Numero de Tarjeta : " + factura.getPedido()
		                                                   .getCliente()
		                                                   .getTarjeta()
		                                                   .getNumero());
		
		//El nombre del titular de la tarjeta del cliente del pedido de la factura(Ramon Baldes garcia)
		System.out.println("\n--El nombre del titular de la tarjeta del cliente del pedido de la factura---\n" );
		System.out.println("Nombre del titular : " + factura.getPedido()
		                                                    .getCliente()
		                                                    .getTarjeta()
		                                                    .getTitularTarjeta());
		
		//El nombre del banco de la tarjeta del cliente del pedido de la factura(Santander)
		System.out.println("\n-El nombre del banco de la tarjeta del cliente del pedido de la factura-\n" );
		System.out.println("Nombre del Banco : " + factura.getPedido()
		                                                  .getCliente()
		                                                  .getTarjeta()
		                                                  .getBanco()
		                                                  .getNombre());
		
		//El país del banco de la tarjeta del cliente del pedido de la factura(Spain)
		System.out.println("\n-El país del banco de la tarjeta del cliente del pedido de la factura-\n" );
		System.out.println("Pais del Banco : " + factura.getPedido()
				                                        .getCliente()
				                                        .getTarjeta()
				                                        .getBanco()
				                                        .getPaisOpera()
				                                        .getNombre());
		
		//El país de la dirección del cliente del pedido de la factura(Spain)
		System.out.println("\n-El país de la dirección del cliente del pedido de la factura-\n");
		System.out.println("Pais de direccion : " + factura.getPedido()
				                                           .getCliente()
				                                           .getDireccion()
				                                           .getPais()
				                                           .getNombre());
	
	
				

	}

}
