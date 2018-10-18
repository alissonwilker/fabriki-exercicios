import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
	
		
		int numero = entrada.nextInt();
		int maior = numero;
	
	
	while (numero != 0) {	
	  
		if(numero > maior) {
			maior = numero;
		}
		System.out.println("maior = " + maior);
		numero = entrada.nextInt();
	}
	
}
	
}
	 
	
	
	
	



