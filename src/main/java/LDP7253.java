import java.io.PrintStream;
import java.util.Scanner;

public class LDP7253 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			if (i % 10 == 0) {
				saida.println("Multiplo de 10");
			}

		}
	}
}
