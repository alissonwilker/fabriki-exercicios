import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int peso = entrada.nextInt();
		int exc = peso - 50;
		int multa = exc * 4;
		
		if(peso > 50){
			System.out.println("excedente = " + exc);
			System.out.println("multa = " + multa);
		} else if (peso == 50) {
			System.out.println("excedente = " + exc);
			System.out.println("multa = " + multa);
		} 
				
	}	
}
