import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141{
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peso;

		peso = entrada.nextInt();

		if(peso<=50) {
			System.out.println("Excesso de peso: = 0");
			System.out.println("Multa = 0");
		}else {
			System.out.println("Excesso de peso:  = " + (peso - 50));
			System.out.println("Multa = " + ((peso-50) * 4));
		}

	}

}
