import java.util.Scanner;
import java.io.PrintStream;

public class LDP7144{
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main (String[] args) {
		int num = entrada.nextInt();
		String resul = "";
		if (num % 2 == 0) {
			resul += "PAR";
		}else {
			resul += "ÍMPAR";
		}
		
		resul += " E ";

		if (num >= 0) {
			resul += "POSITIVO";
		}else {
			resul += "NEGATIVO";
		}

		saida.println(resul);
	}
}