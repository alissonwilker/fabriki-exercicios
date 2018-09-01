import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	public static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		if (peso > 50){
			int excesso = peso-50;
			int multa = excesso*4;
			saida.println("Excedente = " + excesso);
			saida.println("Multa = " + multa);
		} else {
			saida.println("Excedente = 0");
			saida.println("Multa = 0,00");
			
		}


	}

}
