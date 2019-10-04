import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	private static Scanner entrada = new Scanner (System.in);

	
	public static void main(String[] args) {
		
		List <Integer> conjuntoA = new ArrayList<>();
		List <Integer> conjuntoB = new ArrayList<>();
		List <Integer> conjuntoAB = new ArrayList<>();
		int i;
		
		do {		
			
			i = entrada.nextInt();
			if (i != 0) {
			conjuntoA.add(i);
			}
			
		}while 	(i != 0);
		
		
		do {		
			
			i = entrada.nextInt();	
			if (i != 0) {
			conjuntoB.add(i);
			}
			
		}while 	(i != 0);
		
		
		conjuntoA.removeAll(conjuntoB);
		
		for (i = 0; i < conjuntoA.size(); i++) {
		System.out.println(conjuntoA.get(i));	
		}
	}

}
