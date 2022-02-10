package fim;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println(" par e ");
		}else  {	
			System.out.println(" par e negativo");
		} if (valor >= 0) {	
			System.out.println("  positivo");
		}else {
			System.out.println(" negativo");
		}
	}

}
