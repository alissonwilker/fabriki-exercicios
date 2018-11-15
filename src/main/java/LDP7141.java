import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	public static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	int excesso = 0;
	int multa = 0;
	int peso = 0;

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		if (peso > 50){
			int excesso = peso-50;
			int multa = excesso*4;
			saida.println("excedente = " + excesso);
			saida.println("multa = " + multa);
		} else {
			saida.println("excedente = 0");
			saida.println("multa = 0");
			
		}


	}

}

