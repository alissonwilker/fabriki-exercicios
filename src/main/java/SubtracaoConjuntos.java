package aula10;
import java.util.*;
public class SubtracaoConjuntos {
	public static void main(String[] args) {


	   

	
		Set<Integer> conjuntoA = new HashSet<Integer>();
		Set<Integer> conjuntoB = new HashSet<Integer>();
		Set<Integer> conjuntoC = new HashSet<Integer>();


    	  Scanner leitor = new Scanner(System.in);
         
    	  	  for (int i=0;i<3;i++) {
    	  		  System.out.println("Digite numeros lista A ");
    	  		  conjuntoA.add(leitor.nextInt());
    	  }
    	  	  
    	  	  for (int i=0;i<1;i++) {
    	  		  System.out.println("Digite numeros lista B ");
    	  		  conjuntoB.add(leitor.nextInt());
    	  }

		

			conjuntoA.removeAll(conjuntoB);
			
			
			conjuntoC=conjuntoA;

			// print conjuntoC
			System.out.println("resultado A-B : "+ conjuntoC);


	}




}
