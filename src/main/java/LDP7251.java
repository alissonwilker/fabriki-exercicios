import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int maior = num;
		while (num != 0) {
			num = teclado.nextInt();
			if (num != 0 && num > maior) {
				maior = num;
			}
		}
		System.out.println("maior = " + maior);
	}

}
