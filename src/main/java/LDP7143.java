import java.io.PrintStream;
import java.util.Scanner;
public class LDP7143 {
		public static Scanner entrada = new Scanner(System.in);
		public static PrintStream saida = new PrintStream(System.out);
		
		public static void main (String[]args) {
		
			int a= entrada.nextInt();
			int b= entrada.nextInt();
			int c= entrada.nextInt();
			int d= entrada.nextInt();
			
			int a1= a*a;
			int b2= b*b;
			int c2= c*c;
			int d2= d*d;
			
			if(c2>=100){
				saida.println("c2 = "+10000);
			}
			else{ 
			saida.println("a = "+a);
			saida.println("b = "+b);
			saida.println("c = "+c);
			saida.println("d = "+d);
			saida.println("a2 = "+a1);
			saida.println("b2 = "+b2);
			saida.println("c2 = "+c2);
			saida.println("d2 = "+d2);
				
			}
}
}
