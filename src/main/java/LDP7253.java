import java.io.PrintStream;
import java.util.Scanner;

public class LDP7253{
		private static Scanner entrada = new Scanner (System.in);
		private static PrintStream saida = System.out;
		
		public static void main(String[] args) {
			int [] num = new int[100];
			for(int i = 0; i< num.length; i++);
				num[i]= i+1;
				if(num[i]%10 == 0) {
					saida.println("Multiplo de 10");
				}
		}
 }
