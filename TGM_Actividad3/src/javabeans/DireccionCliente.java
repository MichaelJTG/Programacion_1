package javabeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "direccion")
@ToString


public class DireccionCliente {
	
	private String direccion;
	private String localidad;
	private String provincia;
	private Pais pais;
	

}
