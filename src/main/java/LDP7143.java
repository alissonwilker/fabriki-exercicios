import java.util.Scanner;

public class LDP7143 {

	public LDP7143() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		if (c*c<=1000) {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c = "+c);
			System.out.println("d = "+d);
			System.out.println("a2 = "+a*a);
			System.out.println("b2 = "+b*b);
			System.out.println("c2 = "+c*c);
			System.out.println("d2 = "+d*d);
		}
		else {
			System.out.println("c2 = "+c*c);
		}
		
		
	}

}
