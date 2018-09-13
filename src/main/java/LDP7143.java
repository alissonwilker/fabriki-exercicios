import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	 
	public static void main(String[]args){
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		int contador = 2;
		
		if(c*c<1000){
		saida.println("a = " + a);
		saida.println("b = " + b);
		saida.println("c = " + c);
		saida.println("d = " + d);
		saida.println("a" + contador + " = " + a*a);
		saida.println("b" + contador + " = " + b*b);
		saida.println("c" + contador + " = " + c*c);
		saida.println("d" + contador + " = " + d);
	}
		else{
			saida.println("c" + contador + " = " + c*c);
		}				
	}
}
