import java.util.*;
public class SubtracaoConjuntos {
	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int listaA, listaB = 0;
		int resultado;
	   
	    	
		    listaA = ent.nextInt();
	    	int[] listaRecebidaA = new int[listaA];
	    	
	    	listaB = ent.nextInt();
	    	int[] listaRecebidaB = new int[listaB];

	    	    
	    	  Scanner leitor = new Scanner(System.in);
	         
	    	  	  for (int i=0;i< listaA;i++) {
	    	  		 
	    	  		  listaRecebidaA[i]=leitor.nextInt();
	    	  }
	    	  	  
	    	  	  for (int i=0;i< listaB;i++) {
	    	  		  
	    	  		  listaRecebidaB[i]=leitor.nextInt();
	    	  }
	    	 	
	    	   	  
		  
	    	  	  
	    	for (int i=0; i < listaB; i++) { 
	    		
	    		for (int j=0; j < listaA; j++) { 
	    			
	    			if (listaRecebidaA[j]!=listaRecebidaB[i]) { 
	    			
	    				System.out.println(listaRecebidaA[j]); 
	    				}
	    		}
	    	}
	    	
	    	
	    }
		
		
	}
