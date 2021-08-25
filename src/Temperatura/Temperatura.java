package Temperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		// variáveis
		double c, f;
		
		//objetos
		//Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		//entrada
		System.out.println("Conversão de Temperatura");
		//System.out.print("Digite a Temperatura em Fahrenheit: ");
		
		//f= teclado.nextDouble();
		f = Double.parseDouble(JOptionPane.showInputDialog("Insira a Temperatura em Fahreinheit"));
		//processameto
		
		c = (5*(f - 32)) /9;
		
		//saída
		JOptionPane.showMessageDialog(null, formatador.format(c));
		//System.out.println("Temperatura em Celsius: " + formatador.format(c) + " °C");
		//teclado.close();
	}

}
