import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		n = entrada.nextInt();
		
		int fat = 1;
		
		while (n>1) {
			fat = fat * n;
			n = n - 1;
		}
		System.out.println(fat);
	}

}
