import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Set<Integer> numA = new HashSet<Integer>();

		int num;
		do {
			num = entrada.nextInt();
			numA.add(num);

		} while (num != 0);

		Set<Integer> numB = new HashSet<Integer>();
		do {
			num = entrada.nextInt();
			numB.add(num);

		} while (num != 0);

		Set<Integer> subtracao = new HashSet<Integer>(numA);
		subtracao.removeAll(numB);

		for (Integer elementos : subtracao)
			System.out.println(elementos);

	}

}
