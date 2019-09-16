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
			i++;
			
			if(numero > maior ) {
				maior = numero;
			} 
			saida.println("maior = " + maior);

		} while (numero != 0);
		} 
		else {
			saida.println("maior = " + inicial);
		}	
		
	}
}
