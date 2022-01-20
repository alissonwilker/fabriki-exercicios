package aula10;


public class SubtracaoConjuntos {

public static void main(String[] args){
    	

  
	    	
	    	final int[] A = {1,2,3}; // lista A
	    	final int[] B = {2}; // Lista B
	    	 	
	    	for (int i=0; i < B.length; i++) { // percorrendo a lista B
	    		
	    		for (int j=0; j < A.length; j++) { // percorrendo a lista A
	    			
	    			if (A[j]!=B[i]) { // se o conteÃºdo da posiÃ§Ã£o j lista A for diferente da posiÃ§Ã£o i lista B
	    			
	    				System.out.println(A[j]); // imprimir lista a A posiÃ§Ã£o j
	    				}
	    		}
	    	}
	    	
	    	
	    }
		
