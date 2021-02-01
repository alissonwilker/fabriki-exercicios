import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 { //Exercício que busca o maior valor de um conjunto 01/02/21
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		// Insira seu código aqui	
						
		int parada = 0;
		int maior = 0;
			
		while (parada != 1) {
			int novo = entrada.nextInt();
					
			if (novo==0) {
				parada=1;
			}
			else if (novo>maior) {
				maior=novo;
			}
			else {
				parada=0;
			}
	  }
	  System.out.println("maior = "+maior);
  }
}
