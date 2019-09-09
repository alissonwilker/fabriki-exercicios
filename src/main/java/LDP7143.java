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
		
		num = num*num;
		num2 = num2*num2;
		num3 = num3*num3;
		num4 = num4*num4;
		
		if (num3 >= 100) {
			saida.println(num3);
		}
		else {
			saida.println(num);
			saida.println(num2);
			saida.println(num3);
			saida.println(num4);
		}
		
		
		
	}
	

}
