import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = entrada.nextInt();	
		if (numero%2 == 0){
			saida.print("PAR");
		} else {
			saida.print("ÍMPAR");			
		}
		saida.print(" E ");
		if (numero >= 0){
			saida.println("POSITIVO");
		} else {
			saida.println("NEGATIVO");			
		}
	}
}
