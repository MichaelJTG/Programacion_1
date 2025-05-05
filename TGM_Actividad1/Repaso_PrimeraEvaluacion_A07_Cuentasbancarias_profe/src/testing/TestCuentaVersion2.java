package testing;

import javabeans.Cuenta;

public class TestCuentaVersion2 {
	private static Cuenta cuenta1 = new Cuenta(1000, "AHORRO", "Eva Goma", 1500);
	private static Cuenta cuenta2 = new Cuenta(2000, "NOMINA", "Carlos Lopez", 1000);
	 

	public static void main(String[] args) {
		
		abonar();
	   	extractCorrecto();
	  	extractFallido();
	  	transferenciaCorrecta();
	  	transferenciaFallida();

	}
	
	public static void abonar() {
		System.out.println("\nABONO  de 1000 a cuenta1\n");
		
		cuenta1.abono(1000);
		System.out.println(cuenta1); // 2500
		System.out.println("el saldo cuenta 1 es 2500 : " + cuenta1.getSaldo());
	}
	
	public static void extractCorrecto() {
		System.out.println("\nEXTRACTO CORRECTO de 1500 a cuenta1\n");
		
		cuenta1.extraer(1500);
		System.out.println(cuenta1); // 1000
		System.out.println("el saldo cuenta 1 es 1000 : " + cuenta1.getSaldo());
		
	}
	
	public static void extractFallido() {
		System.out.println("\nEXTRACTO NOOO CORRECTO de 1500 a cuenta1\n");
		
		System.out.println(cuenta1.extraer(1500)); // false
		System.out.println(cuenta1); // 1000
		System.out.println("el saldo cuenta 1 es 1000 : " + cuenta1.getSaldo());
	}
	public static void transferenciaCorrecta() {
		System.out.println("\nTRANSFERENCIA CORRECTa de 500 a cuenta1\n");
		
		System.out.println(cuenta1.transferir(cuenta2,500)); // true
		System.out.println(cuenta1); // 500 - 1500
		System.out.println(cuenta2); // 500 - 1500
		System.out.println("el saldo cuenta 1 es 500 : " + cuenta1.getSaldo());
		System.out.println("el saldo cuenta 2 es 1500 : " + cuenta2.getSaldo());
	}
	
	public static void transferenciaFallida() {
		System.out.println("\nTRANSFERENCIA NOOO CORRECTa de 5000 a cuenta1\n");
		
		System.out.println(cuenta1.transferir(cuenta2,5000)); // false
		System.out.println(cuenta1); // 500 - 1500
		System.out.println(cuenta2); // 500 - 1500
		System.out.println("el saldo cuenta 1 es 500 : " + cuenta1.getSaldo());
		System.out.println("el saldo cuenta 2 es 1500 : " + cuenta2.getSaldo());
	}
	
	
	
	

}
