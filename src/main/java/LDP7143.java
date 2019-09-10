import java.io.PrintStream;
import java.util.Scanner;
public class LDP7143 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,quadrado;
		
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		num3=entrada.nextInt();
		num4=entrada.nextInt();
		
		quadrado=num3*num3;
		
		if(quadrado>999) {
			saida.println("c2 = "+quadrado);
			
		}else {
			saida.println("a = "+num1);
			saida.println("b = "+num2);
			saida.println("c = "+num3);
			saida.println("d = "+num4);
			saida.println("a2 = "+num1*num1);
			saida.println("b2 = "+num2*num2);
			saida.println("c2 = "+num3*num3);
			saida.println("d2 = "+num4*num4);
		}
		
		
		
		
		
		
		
		
	}

}
