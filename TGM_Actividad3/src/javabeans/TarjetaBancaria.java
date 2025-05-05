package javabeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "titularTarjeta")
@ToString

public class TarjetaBancaria {
	
	private long numero; 
	private int year;
	private int mes;
	private int cvv;
	private String titularTarjeta;
	private Banco banco;
	
		
		
	}

