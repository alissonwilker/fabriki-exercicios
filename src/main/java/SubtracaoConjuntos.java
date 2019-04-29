import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SubtracaoConjuntos {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int quantidade = entrada.nextInt();

		ArrayList<Integer> primeira = new ArrayList<Integer>();
		ArrayList<Integer> segunda = new ArrayList<Integer>();
		ArrayList<Integer> terceira = new ArrayList<Integer>();

		while (quantidade != 0) {

			primeira.add(quantidade);
			quantidade = entrada.nextInt();

		}
		
		quantidade = entrada.nextInt();

		while (quantidade != 0) {

			segunda.add(quantidade);
			quantidade = entrada.nextInt();

		}

		if (primeira.size() > segunda.size()) {
			for (int i = 0; i < primeira.size(); i++) {
				for (int j = 0; j < segunda.size(); j++) {
					if (primeira.get(i) != segunda.get(j)) {
						terceira.add(primeira.get(i));

					}

				}
			}

			for (int i = 0; i < terceira.size(); i++) {
				System.out.println(terceira.get(i));
			}
		}

	}
}
