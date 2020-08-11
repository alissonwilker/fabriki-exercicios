import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int maiorNumero=0;
		if(numero<0) {
			maiorNumero=numero;
		}
		while(numero!=0) {
			if(numero>maiorNumero) {
				maiorNumero = numero;
			}
			numero = scanner.nextInt();
		}
		System.out.println("maior = "+maiorNumero);
	}

}
