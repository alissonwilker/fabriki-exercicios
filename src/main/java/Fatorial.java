import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x = leitor.nextInt(); 
		leitor.close();

		if (x != 0) {
			int f = x; 

			while (x > 1) {
				f = f * (x - 1); 				
				x--; 
			}
			System.out.println(f);
		} else {
			System.out.println(1);
		}
	}
}
