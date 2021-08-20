import java.util.Scanner;

public class Fatorial {

	private static Scanner fatorial = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number = fatorial.nextInt();fatorial.close();
		int val = number;
		if(number == 0) {
			System.out.println('1');
		} else {
			for(int i = 1; i < number; i++) {
				val *= i;
			}
			System.out.println(val);
		}
	}
}
