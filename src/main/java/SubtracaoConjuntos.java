import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
import java.util.Scanner;

public class SubtracaoConjuntos {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		List<Integer> conjuntoA = new ArrayList<>();
		List<Integer> conjuntoB = new ArrayList<>();

		int a = entrada.nextInt();
		while (a != 0) {
			conjuntoA.add(a);
			a = entrada.nextInt();
		}
		int b = entrada.nextInt();
		while (b != 0) {
			conjuntoB.add(b);
			b = entrada.nextInt();
		}

		conjuntoA.removeAll(conjuntoB);

		for (int i = 0; i < conjuntoA.size(); i++) {
			saida.println(conjuntoA.get(i));	
		}
		
	}

}
