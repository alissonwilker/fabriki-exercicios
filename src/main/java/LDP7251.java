import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=entrada.nextInt();
		int maior = numero;

		while (numero != 0) {
			numero = entrada.nextInt();
			if ((numero > maior) && (numero !=0)) {
				maior = numero;
			}

		}
		System.out.println("maior = " + maior);

		entrada.close();
	}

}
