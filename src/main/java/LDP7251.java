import java.util.Scanner;
public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, maior;
		numero = entrada.nextInt();
		maior = numero;

		while(numero != 0) {
			numero = entrada.nextInt();

			if(numero > maior && numero != 0) {
				maior = numero;
			}
		}	
		entrada.close();
		System.out.println("maior = "+maior);

	}

}
