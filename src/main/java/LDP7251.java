import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int numero = 1, numero_anterior = 1, cont = 0, maior_numero = 0;
		
		while (numero != 0){
			numero = entrada.nextInt();
			cont++;
			
			if (cont == 0) {
				maior_numero = numero;
			}else {
				if (cont > 0 && numero != 0) {
					if (numero > numero_anterior) {
						maior_numero = numero;
					}
				}
			}
			
			if (cont == 0 && numero == 0) {
				maior_numero = 0;
			}
			
			numero_anterior = numero;
		}
		
		System.out.println("maior = "+ maior_numero);
		
	}

}
