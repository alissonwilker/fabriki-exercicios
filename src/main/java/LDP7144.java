import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = entrada.nextInt();

		System.out.println((num % 2 == 0 ?  "PAR" : "ÍMPAR") +" E "+ (num >= 0 ?  "POSITIVO" : "NEGATIVO"));
	}
}
