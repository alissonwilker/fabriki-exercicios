import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {
	private static PrintStream saida = System.out;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numeroA, numeroB;
		ArrayList<Integer> conjuntoA = new ArrayList<Integer>();
		ArrayList<Integer> conjuntoB = new ArrayList<Integer>();
		
		numeroA = entrada.nextInt();
		while(numeroA != 0) {
			conjuntoA.add(numeroA);
			numeroA = entrada.nextInt();
		}
		
		
		numeroB = entrada.nextInt();
		while(conjuntoB.size() < conjuntoA.size() && numeroB != 0) {
			conjuntoB.add(numeroB);
			numeroB = entrada.nextInt();
		}
		
		conjuntoA.removeAll(conjuntoB);

			for(int i=0; i< conjuntoA.size();i++) {
				saida.println(conjuntoA.get(i));
			}
		
		

			
	

	}

}
