import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[]args) {
		int n, maior;
		n = entrada.nextInt();
		maior = n;
		while(n != 0){
			if (n > maior) 
				maior = n;
			n++;
			n = entrada.nextInt();
		}
		saida.println("maior = "+ maior);
	}
}
