package modelo.javabeans;

import java.io.Serializable;
import java.util.Objects;

public class Clientes implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String cif;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private Float facturacion_anual;
	private int numero_empleado;
	

	//constructor vacio
	public Clientes() {
		super();
	}

	//contructor con todo

	public Clientes(String cif, String nombre, String apellidos, String domicilio, Float factura_anual,
			int numero_empleado) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.facturacion_anual = factura_anual;
		this.numero_empleado = numero_empleado;
	}

	//Getter and Setter
	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Float getFactura_anual() {
		return facturacion_anual;
	}

	public void setFactura_anual(Float factura_anual) {
		this.facturacion_anual = factura_anual;
	}

	public int getNumero_empleado() {
		return numero_empleado;
	}

	public void setNumero_empleado(int numero_empleado) {
		this.numero_empleado = numero_empleado;
	}

	//Equals and hashcode de cif
	
	@Override
	public int hashCode() {
		return Objects.hash(cif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(cif, other.cif);
	}

	@Override
	public String toString() {
		return "Clientes [cif=" + cif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio
				+ ", facturacion_anual=" + facturacion_anual + ", numero_empleado=" + numero_empleado + "]";
	}
	
	
}
