package fim;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0 && valor >= 0) {
			System.out.println(" par e positivo");
		}else if (valor % 2 == 0 && valor < 0) {	
			System.out.println(" par e negativo");
		}else if (valor % 2 != 0 && valor >= 0) {	
			System.out.println(" ímpar  e positivo");
		}else if (valor % 2 != 0 && valor < 0) {
			System.out.println(" ímpar  e negativo");
		}
	}

}
