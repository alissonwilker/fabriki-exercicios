import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		boolean par = valor % 2 == 0;
		boolean positivo = valor >= 0;
		
		if (par && positivo) {
			System.out.println("Par e positivo");
		}else if (par && !positivo) {
			System.out.println("Par e negativo");
		}else if (!par && positivo) {
			System.out.println("Impar e positivo");
		}else if (!par && !positivo) {
			System.out.println("Impar e negativo");
		}
		
	}	
}
