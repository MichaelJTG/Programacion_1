package javabean;



public class Fiesta {
	
	//Atributos privados de instancia
	
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;

	
	
	
	//GETTER & SETTER
	
	
	public String getTipoFiesta() {
		return tipoFiesta;
	}
	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	// Constantes de clase
	private static int PRECIO_INVITADOS = 5;
	private static int PRECIO_BOCADILLOS = 3;
	private static int PRECIO_BEBIDAS = 2;


    // Creacion de constructores

	public Fiesta() {
		super();
	}
	
	
    public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas,
    		int invitados,	String fecha,String hora) {
    	
	super();
	this.tipoFiesta = tipoFiesta;
	this.direccion = direccion;
	this.bocadillos = bocadillos;
	this.bebidas = bebidas;
	this.invitados = invitados;
	this.fecha = fecha;
	this.hora = hora;
}
    //To String
    
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	//Metodos responsabilidad de la clase
	
	// suma en UNO los invitados
	public void invitar() {
		invitados++;
	}
	// Suma en la "cantidad" que necesitemos sumar
	public int invitar(int cantidad ) {
		return invitados += cantidad;
		
	}
	//Resta o cancela UNA invitacion 
	public void cancelarInvitacion() {
		 invitados--;
	}
	//Resta o cancela la "cantidad" necesaria
	public int cancelarInvitacion(int cantidad) {
		return invitados -= cantidad;
	}
	//Suma total de costo de la fiesta
	public int precioFiesta() {
		return (PRECIO_BOCADILLOS * bocadillos) + 
				(PRECIO_INVITADOS * invitados) +
				(PRECIO_BEBIDAS * bebidas) ;
	}
}
	
	

