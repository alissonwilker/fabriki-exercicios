package aula10;


public class SubtracaoConjuntos {

public static void main(String[] args){
    	
    	final int[] A = {1,2,3}; // lista A
    	final int[] B = {2}; // Lista B
    	 	
    	for (int i=0; i < B.length; i++) { // percorrendo a lista B
    		
    		for (int j=0; j < A.length; j++) { // percorrendo a lista A
    			
    			if (A[j]!=B[i]) { // se o conteúdo da posição j lista A for diferente da posição i lista B
    			
    				System.out.println(A[j]); // imprimir lista a A posição j
    				}
    		}
    	}
    	
}
}
