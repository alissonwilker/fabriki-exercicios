import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubtracaoConjuntos {

	public static void main(String [] args) {
		final Scanner entrada = new Scanner(System.in);
		int conjuntoa;
		int conjuntob;
		Set A = new HashSet(); 
		Set B = new HashSet(); 
		B.add(2); 
		do { 
			conjuntoa = entrada.nextInt();
			A.add(conjuntoa); 
		}while (conjuntoa!=0);
		do { 
			conjuntob = entrada.nextInt();
			B.add(conjuntob); 
		}while (conjuntob!=0);

		A.removeAll(B);
		A.forEach(System.out::println);
	}
}
