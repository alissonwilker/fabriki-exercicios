import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int fat = 1;
		
		int n = sc.nextInt();
		while (n>0) {
			fat = fat * n;
			n--;
		}
		System.out.println(fat);
		sc.close();
	}

}
