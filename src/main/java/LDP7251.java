import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero = 1;
		int maior = 0;
		
		while(numero != 0) {
			numero = sc.nextInt();
			
			if(maior == 0) {
				maior = numero;
			}
			
			if(numero > maior && numero != 0) {
				maior = numero;
			}
			
		}
		
		System.out.println("maior = "+maior);
		
	}
}
