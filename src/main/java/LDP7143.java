import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		int n4 = entrada.nextInt();
		
		int n1q = n1 * n1;
        int n2q = n2 * n2;
        int n3q = n3 * n3;
        int n4q = n4 * n4;
        
        if(n3q > 1000) {
        	
        	System.out.println("c2 = " + n3q);
       
        }
        else {
        	
        	System.out.println("a = " + n1);
        	System.out.println("b = " + n2);
        	System.out.println("c = " + n3);
        	System.out.println("d = " + n4);
        	System.out.println("a2 = " + n1q);
        	System.out.println("b2 = " + n2q);
        	System.out.println("c2 = " + n3q);
        	System.out.println("d2 = " + n4q);
        }
				

	}

}
