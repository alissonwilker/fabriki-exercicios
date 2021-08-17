import java.util.ArrayList;
import java.util.Scanner;
public class SubtracaoConjuntos {
			public static void main(String[] args) {
		    	Scanner valores = new Scanner(System.in);
		    	int num = valores.nextInt();
		    	ArrayList<Integer> conjuntoA = new ArrayList<Integer>();
		    	ArrayList<Integer> conjuntoB = new ArrayList<Integer>();
		    	while (num!=0){
		        	conjuntoA.add(num);	 		
		        	num = valores.nextInt();
		        }        	  	
		    	int num2 = valores.nextInt();
		    	while (num2!=0){
		        	conjuntoB.add(num2);	 		
		        	num2 = valores.nextInt();
		        } 
		    	valores.close();
	               for(int i = 0; i < conjuntoB.size(); i++) {
		    		if (conjuntoA.contains(conjuntoB.get(i))) {
		    			conjuntoA.remove(conjuntoB.get(i));
		    	}
		    	}
		      	for(int i = 0; i < conjuntoA.size(); i++) {
		        	  System.out.println(conjuntoA.get(i));}
			}
			}
