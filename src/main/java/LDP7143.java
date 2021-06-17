import java.util.Scanner;

public class LDP7143 {

	private static Scanner in;

	public static void main(String[] args)
	{
		int a,b,c,d;
		int c2;
		in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		c2 = (int) Math.pow(c, 2);
		
		if(c2 >= 1000) {
			System.out.println("c2 = " + c2);
		}else {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			System.out.println("a2 = " + (int) Math.pow(a, 2));
			System.out.println("b2 = " +(int) Math.pow(b, 2));
			System.out.println("c2 = " + c2);
			System.out.println("d2 = " + (int) Math.pow(d, 2));
		}
	}
}
