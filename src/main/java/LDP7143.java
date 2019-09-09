import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int n1, n2, n3, n4;
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		n4 = entrada.nextInt();
		int n1r = n1 * n1;
		int n2r = n2 * n2;
		int n3r = n3 * n3;
		int n4r = n4 * n4;
		
		if(n3r >= 1000) {
			saida.println("c2 = "+n3r);
		}else {
			saida.println("a = "+ n1+
					"\nb = "+n2+
					"\nc = "+n3+
					"\nd = "+n4+
					"\na2 = "+n1r+
					"\nb2 = "+n2r+
					"\nc2 = "+n3r+
					"\nd2 = "+n4r);
		}
		

	}

}
