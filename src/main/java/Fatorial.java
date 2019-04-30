import java.util.Scanner;


public class Fatorial {

	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		long numero = s.nextLong();
		long fat;
		
		for (fat = 1; numero >1; numero = numero -1) {
			fat = fat *numero;
		}
		
		System.out.println(fat);
	}

}
