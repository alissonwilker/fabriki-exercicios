import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Integer> ConjA = new ArrayList();
		List<Integer> ConjB = new ArrayList();

		int num = entrada.nextInt();
		ConjA.add(num);

		while (num != 0) {
			num = entrada.nextInt();
			if (num != 0) {
				ConjA.add(num);
			}
		}

		for (int i = 0; i < ConjA.size() - 1; i++) {
			num = entrada.nextInt();
			if (num != 0) {
				ConjB.add(num);

			} else {
				break;
			}
		}

		for (int i = 0; i < ConjA.size(); i++) {
			for (int j = 0; j < ConjB.size(); j++) {
				if (ConjB.get(j) == ConjA.get(i)) {
					ConjA.remove(i);
				}
			}
		}

		for (int i = 0; i < ConjA.size(); i++) {
			System.out.println(ConjA.get(i));
		}
	}
}
