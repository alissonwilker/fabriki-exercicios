import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SubtracaoConjuntos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<Integer> conjunto1 = new ArrayList<>();
		List<Integer> conjunto2 = new ArrayList<>();
		
				
		int a;
		do {			
			a = entrada.nextInt();
			conjunto1.add(a);			
		}while (a != 0);
		
		int b;
		do {
			b = entrada.nextInt();
			conjunto2.add(b);
		}while (b != 0);	
		
		entrada.close();
		
    	for (int i=0; i<conjunto1.size(); i++) {
    		for (int j=0; j<conjunto2.size(); j++) {
    			if (conjunto1.get(i) == conjunto2.get(j)) {
    				conjunto1.remove(i);
    			}
    		}
    	}
		
    	for (int i : conjunto1) {
		System.out.println(i);
    	}
		
	
	}

}
