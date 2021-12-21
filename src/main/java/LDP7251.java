import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
		int ver=0;
		int num, maior;
		maior = entrada.nextInt();
		num = maior;
		if (maior == 0) {
			ver = 1;
		}
		laco1:while (ver== 0) {
			if (num == 0) {
				break laco1;
			}
			else {
				if (num >= maior) {
					maior = num;
				}
			}
		num = entrada.nextInt();
		}
	System.out.println("maior = "+maior);
	}
}
