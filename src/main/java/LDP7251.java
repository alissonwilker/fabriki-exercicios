import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int numero, numero_anterior = 1, cont = 0, maior_numero = 0;
		
		do{
			numero = entrada.nextInt();
			
			if (cont == 0) {
				maior_numero = numero;
			}else {
				if (cont > 0 && numero != 0) {
					if (numero > numero_anterior) {
						maior_numero = numero;
					}
				}
			}
			
			
			cont++;
			numero_anterior = numero;
		}while (numero != 0);
		
		System.out.println("maior = "+ maior_numero);
		
	}

}
