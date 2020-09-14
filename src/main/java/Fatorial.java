import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		int fat=1;
		
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		for(fat = 1; n > 1; n = n - 1) {
			fat = fat * n;
		}
		
		System.out.println(fat);
		
	}

}
