package unico;

public class Ejercicio20 {

	public static void main(String[] args) {

		/*
		 * Implementa un método conversor del Sistema Decimal al Sistema Asteriscos que
		 * sustituye cada cifra por un número correspondiente de asteriscos (*) y separa
		 * las cifras con un guion
		 */
	
		int numero;
		
		numero = Util.leerInt("Introduzca un número entero: ");
		
		
		int digito;
		
		while (numero > 0) {
			digito = numero % 10;
			for (int i = 1; i <= digito; i++) {
				Util.escribir("*");	
			}
			Util.escribir("-");
			numero = numero / 10;
			
		}
		
	}
}
