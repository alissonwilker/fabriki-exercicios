import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {

	public static Scanner entrada = new Scanner(System.in);
	public static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		
		a=num1*num1;
		b=num2*num2;
		c=num3*num3;
		d=num4*num4;
				
		if(c>=1000) {
			saida.println("c2 = 10000");		
		}else {
		saida.println("a = "+num1);
		saida.println("b = "+num2);
		saida.println("c = "+num3);
		saida.println("d = "+num4);
		saida.println("a2 = "+a);
		saida.println("b2 = "+b);
		saida.println("c2 = "+c);
		saida.println("d2 = "+d);
		}
	}

}
