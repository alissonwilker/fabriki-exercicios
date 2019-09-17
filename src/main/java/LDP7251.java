import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada;
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int num;
		int Nmaior =0;
		int cont = 1;

		num = entrada.nextInt();
		
		do {

		if (Nmaior < num) {
		Nmaior = num;
		cont++;
		}if (Nmaior > num) {
		Nmaior = num;
		cont--;
		}else {
		Nmaior = num;
		}
		
		num = entrada.nextInt();

		} while ( num != 0 );

		saida.println("maior = "+Nmaior);
		
	}
}
