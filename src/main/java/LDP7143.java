
import java.util.Scanner;

public class LDP7143 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		int n4 = entrada.nextInt();

		int quadradoN1 = n1 * n1;
		int quadradoN2 = n2 * n2;
		int quadradoN3 = n3 * n3;
		int quadradoN4 = n4 * n4;
		
		if(quadradoN3 >= 1000) {
			System.out.println("c2 = " + quadradoN3);
		}else {
			System.out.println("a = " + n1);
			System.out.println("b = " + n2);
			System.out.println("c = " + n3);
			System.out.println("d = " + n4);
			System.out.println("a2 = " + quadradoN1);
			System.out.println("b2 = " + quadradoN2);
			System.out.println("c2 = " + quadradoN3);
			System.out.println("d2 = " + quadradoN4);
		}
		
		
		entrada.close();
	}
}
