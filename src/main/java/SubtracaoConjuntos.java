package aula10;
import java.util.*;
public class SubtracaoConjuntos {
	public static void main(String[] args) {


	   
	    	
	   	  System.out.println("* CALCULANDO DIFERENÇA ENTRE DOIS CONJUNTOS *");
	    	int[] listaA = new int[3];
	    	int[] listaB = new int[1];

	    	    
	    	  Scanner leitor = new Scanner(System.in);
	         
	    	  	  for (int i=0;i<listaA.length;i++) {
	    	  		  System.out.println("Digite numeros lista A ");
	    	  		  listaA[i]=leitor.nextInt();
	    	  }
	    	  	  
	    	  	  for (int i=0;i<listaB.length;i++) {
	    	  		  System.out.println("Digite numeros lista B ");
	    	  		  listaB[i]=leitor.nextInt();
	    	  }
	    	 	
	    	   	  System.out.println("* DIFERENÇA ENTRE OS DOIS CONJUNTOS A-B *");
		  
	    	  	  
	    	for (int i=0; i < listaB.length; i++) { 
	    		
	    		for (int j=0; j < listaA.length; j++) { 
	    			
	    			if (listaA[j]!=listaB[i]) { 
	    			
	    				System.out.println(listaA[j]); 
	    				}
	    		}
	    	}
	    	
	    	
	    }
		
		
	}
