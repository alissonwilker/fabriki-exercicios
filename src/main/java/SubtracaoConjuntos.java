import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		List<Integer> listaA = new ArrayList<Integer>();
		List<Integer> listaB = new ArrayList<Integer>();
		
		
		int num1 = 1, num2 = 1;
		
		while(num1!=0) {
			num1 = entrada.nextInt();
			if(num1!=0) {
				listaA.add(num1);
			}
		}
		
		while(num2!=0) {
			num2 = entrada.nextInt();
			if(num2!=0) {
				listaB.add(num2);
			}
		}
		if(listaB.size()<=listaA.size()) {
			
			listaA.removeAll(listaB);
			
			for(int i=0;i<listaA.size();i++) {
				saida.println(listaA.get(i));
			}	
		}
	}
}
