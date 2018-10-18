import java.util.Scanner;

public class LDP7251{
	public static void main(String[] args) {
		int maior, num = 1;

		System.out.print("Digite um numero ou digite 0 para sair...: ");
		num = STDIN_SCANNER.nextInt();
		maior = num;

		while(num != 0) {
			
			num = STDIN_SCANNER.nextInt();

			if(num > maior) {
				maior = num;
			}
		}
		System.out.print("O maior numero e...: " + maior);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}