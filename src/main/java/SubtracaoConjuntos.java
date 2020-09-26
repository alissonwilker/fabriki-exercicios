import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		Set<Integer>conjuntoA = new HashSet<>();
		Set<Integer>conjuntoB = new HashSet<>();
		int r = 1;
		int s = 1;

		while(r != 0) {
			r = scanner.nextInt();
			conjuntoA.add(a);
		}
		while(s != 0) {
			s = scanner.nextInt();
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
