import java.io.PrintStream;
import java.util.Scanner;
public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = entrada.nextInt();
		int fat = n;
		while (n > 1) {
			fat = fat * (n - 1);
			n--;
		}
		saida.println(fat);
	}

}
