import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=1;
		int maior = 0;
		

		while (numero != 0) {
			numero = entrada.nextInt();
			if (numero > maior) {
				maior = numero;
			} else {
				
			}

		}
		System.out.println("maior = " + maior);

		entrada.close();
	}

}
