package fevereiro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner (System.in);
		double media, soma = 0;
		int qtdeNotas = entrada.nextInt();
		int [] notas = new int [qtdeNotas];
		
		for ( int i = 0; i <  qtdeNotas; i++) {
			notas [i] = entrada.nextInt();
			soma += notas[i];
		
		}
		media = soma /  qtdeNotas;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		
		System.out.format("media = %,.1f%n", media);
		for ( int i = 0; i < notas.length; i++) {
			System.out.format("nota " + (i+1) + " =notas[i]" + ",0 ");	
			

		}
		entrada.close();
	}
	

}
