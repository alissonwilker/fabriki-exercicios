import java.util.Scanner;
public class LDP7144 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		byte n = 36;
		byte n2 = -12;
		byte n3 = 13;
		byte n4 = -7;
		
		System.out.println("Digite um número inteiro: ");
		numero = entrada.nextInt();

		if (n) {
		 System.out.println("36 é Par e Positivo");
		} else if (n2) {
			System.out.println("-12 é Par e Negativo");
		} else if (n3) {
			System.out.println("13 é Ímpar e Positivo ");
		} else if (n4) {
			System.out.println("-7 é Impar e Negativo");
		} else {
			System.out.println("Não pertence ao quadro de números apresentado previamente");
		}
	}
}
