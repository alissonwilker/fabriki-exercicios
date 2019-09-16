import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int maior;
		int i=0;
		int numero;
		
		int inicial = entrada.nextInt();
		maior = inicial;
		
		if (inicial != 0) {
		do {
			numero = entrada.nextInt();
			
			
			if(numero > maior && numero != 0) {
				maior = numero;
			} else {
				maior = maior;
				
			}
			i++;
			

		} while (numero != 0);
		saida.println("maior = " + maior);
		} 
		else {
			saida.println("maior = " + inicial);
		}
	
		
	}
}
