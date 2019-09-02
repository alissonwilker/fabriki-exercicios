import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fat,i, n;
		
		n = entrada.nextInt();
		fat = 1;
		
		for( i = 1; i<=n; i++) {
			fat = fat*i;
			System.out.println(fat);
		}
		
	}

}

