import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
		int excedente;
		int multa; 
		int kilo = entrada.nextInt();
		
		if(kilo > 50) {
		  excedente = kilo - 50;
		  multa = excedente*4;
		  saida.println("excedente = " + excedente);
		  saida.println("multa = " + multa);				
		}else {
			excedente = 0;
			multa = 0;
			saida.println("excedente = " + excedente);
			saida.println("multa = " + multa);
			
		}
	

	}

}
