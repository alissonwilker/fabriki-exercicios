
import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i;
	    int maior = Integer.MIN_VALUE;
	   		
	    do {
	    	i = scanner.nextInt();
			if (i > maior) {
		    maior = i;
		    } 	        
	    } while (i != 0); 
	System.out.println("maior = " + maior);
	scanner.close();
	} 
}
