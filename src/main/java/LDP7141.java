package logica;

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner (System.in);
private static String saida = System.out;

	public static void main(String[] args) {
		int peixes = entrada.nextInt();
		int exc = peixes - 50; 
		int mul = exc * 4;
	if(peixes >= 50) saida = "excedente = 0 multa = 0";
	if (peixes < 50) saida = ("excedente = " + exc +  " multa = " + mul);

	}

}
