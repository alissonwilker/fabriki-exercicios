import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {
    
  private static Scanner entrada = new Scanner(System.in);
  private static PrintStream saida = System.out;
    
    public static void main(String[] args) {
        
   List<Integer> ca = new ArrayList<>();
   List<Integer> cb = new ArrayList<>();
   List<Integer> cc = new ArrayList<>();
	int i;	
		
		
                
                do{
                    i= entrada.nextInt();
                    if (i !=0) {
                        ca.add(i);
                        
                    }
                    
                }while (i !=0);
                    
                        
                                             
                    
                do{
                    i= entrada.nextInt();
                    if (i !=0) {
                        cb.add(i);
                        
                    }
                    
                }while (i !=0);
                    
                     
                        
                     ca.removeAll(cb);
                       
                     
                    for (i = 0; i < ca.size(); i++) {
			System.out.println(ca.get(i));   
                        
                    }
    }
                        
                    }
                         
