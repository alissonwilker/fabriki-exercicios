import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SubtracaoConjuntos {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		//contA = 0, contB = 0;
		List <Integer> listaA = new ArrayList<>();
		List <Integer> listaB = new ArrayList<>();
		int a = entrada.nextInt();
		while(a != 0) {
			listaA.add(a);
			a = entrada.nextInt();
		}
		int b = entrada.nextInt();
		while(b != 0) {
			listaB.add(b);
			b = entrada.nextInt();
		}
		listaA.removeAll(listaB);
		for(int i = 0; i < listaA.size(); i++) {
			saida.println(listaA.get(i));
		}
		
	}

}
