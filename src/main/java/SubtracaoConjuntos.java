import java.util.List;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		List<Integer> conjuntoA = new ArrayList<>();
		List<Integer> conjuntoB = new ArrayList<>();
		List<Integer> conjuntoC = new ArrayList<>();

		preencherConjunto(conjuntoA);
		preencherConjunto(conjuntoB);
		
		conjuntoC.addAll(conjuntoA);
		conjuntoC.removeAll(conjuntoB);
		
		for (int i = 0; i < conjuntoC.size(); i++) {
			saida.println(conjuntoC.get(i));
		}
	}

	private static void preencherConjunto(List<Integer> conjunto) {
		int elemento = entrada.nextInt();
		while (elemento != 0) {
			conjunto.add(elemento);
			elemento = entrada.nextInt();
		}
	}
}
