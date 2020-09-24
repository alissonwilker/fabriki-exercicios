import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		Set<Integer>conjuntoA = new HashSet<>();
		Set<Integer>conjuntoB = new HashSet<>();
		int a = 1;
		int b = 1;

		while(a != 0) {
			a = scanner.nextInt();
			conjuntoA.add(a);
		}
		while(b != 0) {
			b = scanner.nextInt();
			conjuntoB.add(b);
		}

		conjuntoA.removeAll(conjuntoB);

		Iterator<Integer>iterador = conjuntoA.iterator();
		while(iterador.hasNext()) {

			Integer elemento = iterador.next();
			System.out.println(elemento);

		}

	}

}
