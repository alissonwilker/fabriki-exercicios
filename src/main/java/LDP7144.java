package fim;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		
		if (valor % 3 == 1 && valor >= 1) {
			System.out.println(" impar e positivo");
		}else if (valor % 3 == 1 && valor < 1) {	
			System.out.println(" impar e negativo");
		}else if (valor % 3 != 1 && valor >= 1) {	
			System.out.println(" par  e positivo");
		}else if (valor % 3 != 1 && valor < 1) {
			System.out.println(" par  e negativo");
		}
	}

}

	

