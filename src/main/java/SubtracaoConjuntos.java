import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int a,b=0;
		List<Integer> listaA =new ArrayList<>();
		List<Integer> listaB =new ArrayList<>();
		
		do {
			a=entrada.nextInt();
			listaA.add(a);
			
		}while(a!=0);
		
		
		do {
			
			b=entrada.nextInt();
			listaB.add(b);
			
			
		}while(b!=0 );
		
		
		
	//System.out.println(listaA);
	
	listaA.removeAll(listaB);
	
	
	//listaA.remove(listaA.size()-1);
	//System.out.println(listaA);

	
	for (int i=0; i<listaA.size();i++) {
		
		System.out.println(listaA.get(i));
	}
		
	
	}

}
