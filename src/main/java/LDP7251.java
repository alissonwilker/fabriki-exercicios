	
import java.util.Scanner;

public class LDP7251 {

public static void main(String[] args) {
		int numero;
		int maior;
		Scanner entrada= new Scanner (System.in);
		numero= entrada.nextInt();
		maior = numero;

		while (numero != 0) {
				if(numero > maior) {
				maior = numero;
				}
			numero= entrada.nextInt();
		}
		System.out.println("maior = "+maior);
	}
}
