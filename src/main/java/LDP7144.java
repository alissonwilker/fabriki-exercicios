import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int numero = entrada.nextInt();
		if(numero == 0) {
			saida.println("PAR E POSITIVO");
		}else {
			if(numero % 2 == 0) {
				if(numero < 0){
					saida.println("PAR E NEGATIVO");
				} else {
					saida.println("PAR E POSITIVO");
				}
			}else if(numero % 2 != 0) {
				if(numero < 0) {
					saida.println("ÍMPAR E NEGATIVO");
				} else {
					saida.println("ÍMPAR E POSITIVO");
				}
			}
		}


	}

}
