package javabeans;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "codigoFactura")
@ToString

public class Factura {
	
	private String codigoFactura;
	private String descripcion;
	private LocalDate fechaFactura;
	private Pedido pedido;
	
}
