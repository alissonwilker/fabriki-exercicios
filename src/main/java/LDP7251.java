import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
		int ver=0;
		int num, maior;
		System.out.println("Entre um numero");
		maior = entrada.nextInt();
		if (maior == 0) {
			ver = 1;
		}
		laco1:while (ver== 0) {
			System.out.println("Entre outro numero");
			num = entrada.nextInt();
			if (num == 0) {
				if (num >= maior) {
					maior = num;
				}
				break laco1;
			}
			else {
				if (num >= maior) {
					maior = num;
				}
			}
		}
	System.out.println("maior = "+maior);
	}
}
