import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
	try (Scanner entrada = new Scanner(System.in)) {
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0 && valor >= 0) {
			System.out.print("Par e positivo");
		} 
		else if (valor % 2 == 0 && valor <0) {
			System.out.print("Par e negativo");
		}
		else if (valor % 2 != 0 && valor >= 0 ) {
			System.out.print("ímpar e positivo");
		}
		else if (valor % 2 != 0 && valor <0) {
			System.out.print("Impar e negativo");
		}
	}
		
	}
	

}
