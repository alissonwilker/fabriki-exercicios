import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
	
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
	
		  Scanner scanner = new Scanner(System.in);
		
		        
		         int p=1, g=1;
                
                          while(p!=0) {
                                p = scanner.nextInt();
                                    A.add(p);  
	                        }
		   
		                  while(g!=0  ) {
			
				            	g = scanner.nextInt();
				                	B.add(g);
		                    }

		A.removeAll(B);
		 
		  
		  
		  
		  for(int f=0; f<=A.size();f++) {
                System.out.println(A.get(f));
                
                 }
	
}
}
