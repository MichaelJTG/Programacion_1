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
@EqualsAndHashCode(of = "idPedido")
@ToString
public class Pedido {
	
	private int idPedido; 
	private LocalDate createAt;
	private String estado;
	private Cliente cliente;




}
