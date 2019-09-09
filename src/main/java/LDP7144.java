import java.util.Scanner;
import java.io.PrintStream;

public class LDP7144 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = entrada.nextInt();
		
		if(numero%2 ==0) {
			if(numero >= 0) {
				saida.println("PAR E POSITIVO");
			}else {saida.println("PAR E NEGATIVO");}
		}else {
			if(numero > 0) {
			saida.println("ÍMPAR E POSITIVO");
			}else {
				saida.println("ÍMPAR E NEGATIVO");
			}
		}
	}

}
