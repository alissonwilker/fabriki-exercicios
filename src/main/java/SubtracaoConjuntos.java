import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class SubtracaoConjuntos
{
	public static void main(String[] args) {
	
	    Scanner num = new Scanner(System.in);
	
	
    	ArrayList<Integer> conjA = new ArrayList<>();
	
        int numA = num.nextInt();

        while(numA != 0){
            conjA.add(numA);
            numA = num.nextInt();
        }
    
    
        ArrayList<Integer> conjB = new ArrayList<>();
	
        
        int numB = num.nextInt();

        while(numB != 0){
            conjB.add(numB);
            numB = num.nextInt();
        }
    
    
        List<Integer> AB = new ArrayList<>();

		for (Integer elementoA : conjA) {
			boolean estaEmA = false;
			for (Integer elementoB : conjB) {
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
