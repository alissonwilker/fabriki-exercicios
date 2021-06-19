import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
				
		int a2 = a*a;
		int b2 = b*b;
		int c2 = c*c;
		int d2 = d*d;
				
		if (c2>=1000) {
			System.out.println("c2="+c2);
		} else {
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
			
			System.out.println("a2="+a2);
			System.out.println("b2="+b2);
			System.out.println("c2="+c2);
			System.out.println("d2="+d2);
		}	
	}

}
