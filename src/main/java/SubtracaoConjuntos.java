import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		List<Integer> conjuntoA = new ArrayList<>();
		List<Integer> conjuntoB = new ArrayList<>();

		int valor = 0;
		do {
			valor = entrada.nextInt();
			conjuntoA.add(valor);
		} while (valor != 0);

		do {
			valor = entrada.nextInt();
			conjuntoB.add(valor);
		} while (valor != 0);
		
		for (Integer elementoB : conjuntoB) {
			if (conjuntoA.contains(elementoB)) {
				conjuntoA.remove(elementoB);
			}
		}
		
		for (Integer elementoA : conjuntoA) {
			saida.println(elementoA);
		}
	}
}
