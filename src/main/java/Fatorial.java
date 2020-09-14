import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		int fat=1;
		int i;
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
	
		for(int cont; n>1; n--) {
			fat = fat * n;
		}
		
		System.out.println(fat);
		
	}

}
