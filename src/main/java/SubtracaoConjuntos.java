import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SubtracaoConjuntos{

	 public static void main(String[] args) {
	
	        Set<Integer> conjuntoA = new HashSet<>();
	        Set<Integer> conjuntoB = new HashSet<>();
	         
	        Scanner scanner = new Scanner(System.in);
	        int numConjuntos = 1;  
	            
	            do { 
	            	numConjuntos = scanner.nextInt();
	                conjuntoA.add(numConjuntos);
	             
	            }while (numConjuntos!=0);
	            
			         do{
			                
			           numConjuntos = scanner.nextInt();
			           conjuntoB.add(numConjuntos);
		                
				         if(numConjuntos==0){
				         conjuntoA.removeAll(conjuntoB);
				                
				         System.out.println(conjuntoA);
						  }
				         
					   }while (numConjuntos!=0);
		      
	                
	}
}
