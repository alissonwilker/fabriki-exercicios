import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso, excedente =0, multa=0;
		System.out.println ("Informe o peso: ");
		peso = entrada.nextInt();
		if (peso > 50) {
			excedente = peso - 50;
			multa = 4 * excedente;
		}
		System.out.println ("excedente = "+ excedente);
		System.out.println ("multa = "+ multa);

	}

}
