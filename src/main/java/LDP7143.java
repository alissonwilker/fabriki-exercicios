import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);	
	public static void main(String[] args) {
	    
		int a = 0;
		int b = 0;
	    int c = 0;
	    int d = 0;
		int a2 = 0;
		int b2 = 0;
	    int c2 = 0;
	    int d2 = 0;

	    a = entrada.nextInt();
	    b = entrada.nextInt();
	    c = entrada.nextInt();
	    d = entrada.nextInt();
	    
	    a2 = a * a;
	    b2 = b * b;
	    c2 = c * c;
	    d2 = d * d;
	    	    
	    if (c2 >= 1000) {
	    System.out.println ("c2 = " + c2);	    
	    }
	    else {
		System.out.println ("a = " + a);
		System.out.println ("b = " + b);
		System.out.println ("c = " + c);
		System.out.println ("d = " + d);
		System.out.println ("a2 = " + a2);
		System.out.println ("b2 = " + b2);
		System.out.println ("c2 = " + c2);
		System.out.println ("d2 = " + d2);
	    }
	}
}
