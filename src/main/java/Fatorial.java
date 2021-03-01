import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, fatorial = 1;
		
		num = entrada.nextInt();
		for (int i = 1; i <= num; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		
	}
}
