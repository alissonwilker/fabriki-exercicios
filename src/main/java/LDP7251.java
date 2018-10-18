import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int maior;
		int numero;
		
		numero = entrada.nextInt();
		maior = numero;
		
		while (numero != 0){
			
			if (numero > maior){
				maior = numero;
			}
			numero = entrada.nextInt();
		}
		System.out.println("maior = " + maior);

	}

}