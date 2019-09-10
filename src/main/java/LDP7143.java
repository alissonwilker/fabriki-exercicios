import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int n1,n2,n3,n4;
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		n4 = entrada.nextInt();
		
		int N1 = n1 * n1;
		int N2 = n2 * n2;
		int N3 = n3 * n3;
		int N4 = n4 * n4;
		
		if (n3*n3 >= 1000) {
		saida.println("C2 = "+ n3*n3);
		} else { 
			saida.println("a = " +n1+
					"\nb = " +n2+
					"\nc = " +n3+
					"\nd = " +n4+
					"\na2 = " +N1+
					"\nb2 = " +N2+
					"\nc2 = " +N3+
					"\nd2 = " +N4);
		}
	}
 }
