package aula;
import java.util.Scanner;


public class LDP7251 {

	public static void main(String[] args) {
		int maior, num;

		Scanner entrada = new Scanner(System.in);

		num = entrada.nextInt();
		maior = num;
		

		while (num != 0) {

			

			if (num > maior) {
				maior = num;
			}
			num = entrada.nextInt();

		}
         entrada.close();
		System.out.println("maior = " + maior);

	}

}

