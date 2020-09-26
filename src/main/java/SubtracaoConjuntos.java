import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {

  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
        
    ArrayList<Integer> Set1 = new ArrayList<Integer>();
    	int n = scanner1.nextInt();
    	while (n != 0) {
    		Set1.add(n);
    }
    	scanner1.close();
    	
    ArrayList<Integer> Set2 = new ArrayList<Integer>();
    	int t = scanner1.nextInt();
    	while (t != 0) { 
    		Set2.add(t);
	} 
    	scanner2.close();
    	
    	Set1.removeAll(Set2);
    	System.out.println(Set1);
  }  
}
