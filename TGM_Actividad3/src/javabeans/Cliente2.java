package javabeans;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "idCliente")
@ToString

public class Cliente2 {
	/*Crear una clase Cliente, en el mismo paqute denominado Cliente2, con los mismos
	   atributos de Cliente anterior, pero en lugar de tener un atributo con una Tarjeta, tenga una
	   Lista de objetos de la clase Tarjeta.
	*/
	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createdAt;
	private DireccionCliente direccion;
	private ArrayList<TarjetaBancaria>tarjetas;

		
	}
	
	
	
	
	
	
