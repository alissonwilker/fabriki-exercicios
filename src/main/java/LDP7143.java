import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	// DECLARAÇÃO DAS VARIÁVEIS INTEIRAS
	private static int a, b, c, d, a2, b2, c2, d2;
	
	public static void main(String[] args) {
		//LEIA UM INTEIRO E ARMAZENE NA VARIÁVEL a
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		//PROCESSAMENTO
		a2 = a * a; //CALCULE O QUADRADO DE a
		b2 = b * b;
		c2 = c * c;
		d2 = d * d;
		
		//SAIDA
		if (c2 >= 1000) { //SE c2 É MAIOR OU IGUAL A 1000...
			saida.println("c2 = " + c2);
		} else {
			//ESCREVA 'a = <valor de a>'
			saida.println("a = " + a);
			saida.println("b = " + b);
			saida.println("c = " + c);
			saida.println("d = " + d);
			saida.println("a2 = " + a2);
			saida.println("b2 = " + b2);
			saida.println("c2 = " + c2);
			saida.println("d2 = " + d2);
		}
		
	}
	
}
