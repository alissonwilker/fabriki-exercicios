import java.io.PrintStream;
import java.util.Scanner;
public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int N, maior;
		N = entrada.nextInt();
		maior = N;
		while(N != 0) {
			if(N > maior) {
				maior = N;
				N++;
			}
			N = entrada.nextInt();
		}
		saida.println("maior = "+maior);
	}
}
