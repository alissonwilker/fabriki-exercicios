import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		a = a * a;
		b = b * b;
		c = c * c;
		d = d * d;
		
		if ( c >= 100){
			System.out.println("c2 = " + c);
		}else {
			System.out.println("a2 = "+ a);
			System.out.println("b2 = "+ b);
			System.out.println("c2 = "+ c);
			System.out.println("d2 = "+ d);
		}
		

	}

}
