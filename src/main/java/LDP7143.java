import java.util.Scanner;

public class LDP7143 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int a = entrada.nextInt();
	int b = entrada.nextInt();
	int c = entrada.nextInt();
	int d = entrada.nextInt();
	int a2 = (a * a), b2 = (b * b), c2 = (c * c), d2 = (d * d);
	
	if (c >= 1000) {
		System.out.println("c2 = " + c2);
	}
	else {
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
