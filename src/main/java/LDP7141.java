import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// 
		Scanner entrada = new Scanner(System.in); 
		int a = entrada.nextInt();
		int excedente;
		int multa;
		if (a>=50) {
			excedente = a-50;
			multa = excedente*4;
		}
		else {
			excedente = 0;
			multa = 0;
		}

		System.out.println("excedente = " + excedente);
		System.out.println("multa = " + multa);
	}
}
