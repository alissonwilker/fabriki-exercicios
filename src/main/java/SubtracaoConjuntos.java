

import java.util.ArrayList;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;

public class SubtracaoConjuntos {

	public static void main(String[] args) {

		Set<Integer> textos = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		int linha;
		do {
			linha = scanner.nextInt();
			textos.add(linha);

		} while ((linha != 0));

		Set<Integer> textos2 = new HashSet<Integer>();

		int linha2;
		do {
			linha2 = scanner.nextInt();
			textos2.add(linha2);

		} while ((linha2 != 0));

		scanner.close();
		
		textos.removeAll(textos2);
		System.out.println(textos);
		
		
	}
}
