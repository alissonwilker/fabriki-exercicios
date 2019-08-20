import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;

		num1 = entrada.nextInt();

		if (num1 > 50) {
			saida.println("excedente = 20");
			saida.println("multa = 20");
		} else if (num1 <= 50) {
			saida.println("excedente = 0");
			saida.println("multa = 0");
		}

	}

}
