import java.util.Scanner;

public class LDP7143 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a  = scanner.nextInt();
		int b  = scanner.nextInt();
		int c  = scanner.nextInt();
		int d  = scanner.nextInt();
	
		int c2 = c*c;
	
		
		if (c2>=1000) {
			System.out.println("c2 = " + c2);
		}
		else {
			int a2 = a*a;
			int b2 = b*b;
			int d2 = d*d;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			System.out.println("a2 = " + a2);
			System.out.println("b2 = " + b2);
			System.out.println("c2 = " + c2);
			System.out.println("d2 = " + d2);
		}
		
	}

}
