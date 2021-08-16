import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		Integer num;
		do {
			num = entrada.nextInt();
			A.add(num);
		}while(num != 0);

		do {
			num = entrada.nextInt();
			B.add(num);
		}while(num != 0);

		List<Integer> AB = new ArrayList<>();

		for (Integer elementoA : A) {
			boolean estaEmA = false;
			for (Integer elementoB : B) {
				if(elementoB == elementoA) {
					estaEmA = true;
				}
			}
			if(!estaEmA) {
				AB.add(elementoA);
			}
		}
		for (Integer elementoAB : AB) {
			System.out.println(elementoAB);

		}
	}
}
