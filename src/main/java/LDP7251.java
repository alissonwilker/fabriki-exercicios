import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1, maior = 0;
		
		n = entrada.nextInt();
		maior = n;
		
	while(n != 0) {
			
		if(n != 0) {
			n = entrada.nextInt();
			if(n == 0) {break;}
			
			 if(n > maior) {
				 maior = n;
			 }
		}
		 
	}
	
	
		System.out.println("maior = "+maior);
	}

}
