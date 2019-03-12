import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		int excedente = (peso - 50);
		int multa = excedente*4; 
		
		if ( peso >50) {
			System.out.println("excedente = " + excedente);
			System.out.println("multa = " + multa);
		}
		
		else  { 
		excedente = 0;
		System.out.println("excedente = " + excedente);
		multa = 0;
		System.out.println("multa = " + multa);
	}

	}
}
