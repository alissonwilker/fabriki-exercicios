import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada;
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		

		entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		int quad;
		
		quad= num3*num3;
		
		if (num3 >= 100) {
			saida.println("c2 = "+quad);
		}
		else {
			saida.println("a = "+num);
			  saida.println("b = "+num2);
			  saida.println("c = "+num3);
			  saida.println("d = "+num4);
			  saida.println("a2 = "+num*num);
			  saida.println("b2 = "+num2*num2);
			  saida.println("c2 = "+num3*num3);
			  saida.println("d2 = "+num4*num4);
		}
		
		
		
	}
	

}
