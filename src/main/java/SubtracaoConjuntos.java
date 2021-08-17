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
			    
			for(int i = 0; i < conjuntoA.size(); i++) {
				for(int j = 0; j < conjuntoB.size(); j++) {
							if (conjuntoA.get(i)!=conjuntoB.get(j)) {System.out.println(conjuntoA.get(i));
							}
							}
	}}}
