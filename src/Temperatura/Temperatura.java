package Temperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// vari�veis
		double c, f;
		
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		//entrada
		System.out.println("Convers�o de Temperatura");
		System.out.print("Digite a Temperatura em Fahrenheit: ");
		
		f= teclado.nextDouble();
		
		//processameto
		
		c = (5*(f - 32)) /9;
		
		//sa�da
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + " �C");
		teclado.close();
	}

}
