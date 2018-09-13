import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	static int a;
	static int b;
	static int c;
	static int d;
	
	public static void main(String[] args) {
		
		int num1 =  entrada.nextInt();
		int num2 =  entrada.nextInt();
		int num3 =  entrada.nextInt();
		int num4 =  entrada.nextInt();
		
		a = num1 * num1;
		b = num2 * num2;
		c = num3 * num3;
		d = num4 * num4;
		
		if(c >= 1000)
		{
			System.out.println("c2 = "+c);
		}else
		{
			System.out.println("a = "+num1);
			System.out.println("b = "+num2);
			System.out.println("c = "+num3);
			System.out.println("d = "+num4);
			System.out.println("a2 = "+a);
			System.out.println("b2 = "+b);
			System.out.println("c2 = "+c);
			System.out.println("d2 = "+d);
			
		}
		
		
		
	}
}
