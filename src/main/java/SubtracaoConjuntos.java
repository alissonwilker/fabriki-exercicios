import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List conjuntoA = new ArrayList();
		List conjuntoB = new ArrayList();
		List conjuntoC = new ArrayList();

		int cont = 0;
		do {
			conjuntoA.add(scan.nextInt());
			int pausa = (int) conjuntoA.get(cont);
			if (pausa == 0) {
				break;
			}
			conjuntoC.add(conjuntoA.get(cont));
			cont++;
		} while (true);

		int cont1 = 0;
		do {
			conjuntoB.add(scan.nextInt());
			int pausa = (int) conjuntoB.get(cont1);
			if (pausa == 0) {
				break;
			}
			conjuntoC.add(conjuntoB.get(cont1));

			cont1++;
		} while (true);

		for (int i = 0; i < conjuntoC.size(); i++) {
			for (int j = i + 1; j < conjuntoC.size(); j++) {
				if (conjuntoC.get(i) == conjuntoC.get(j)) {
					conjuntoC.remove(j);
					conjuntoC.remove(i);}}}
		
		for (int i = 0; i < conjuntoC.size(); i++) {
			System.out.println(conjuntoC.get(i));}
	}
}
