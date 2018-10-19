import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {

		int maior, num;
		int count = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("");
		num = entrada.nextInt();
		maior = num;

		while (count <= 0) {
			System.out.print("Numero " + count + ": ");
			num = entrada.nextInt();

			if (num > maior) {
				maior = num;
			}

			count++;
		}

		System.out.println("maior = " + maior);

	}
