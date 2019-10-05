import java.io.PrintStream;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class SubtracaoConjuntos {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		List<Integer> listaA = new ArrayList<>();
		List<Integer> listaB = new ArrayList<>();
		int conjA, conjB, x, y;

		do {
			conjA = entrada.nextInt();

			listaA.add(conjA);

		} while (conjA != 0);

		x = listaA.lastIndexOf(conjA);
		listaA.remove(x);

		do {
			conjB = entrada.nextInt();
			listaB.add(conjB);
		} while (conjB != 0);

		y = listaB.lastIndexOf(conjB);
		listaB.remove(y);

		if (listaB.size() < listaA.size()) {

			listaA.removeAll(listaB);

		} else {
			System.exit(-1);
		}

		for (int i = 0; i < listaA.size(); i++) {
			System.out.println(listaA.get(i));
		}

	}
}
