import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			
			int n = 0, resQuadrado1, resQuadrado2, resQuadrado3, resQuadrado4;
		
			n = entrada.nextInt();
			int n2 = entrada.nextInt();
			int n3 = entrada.nextInt();
			int n4 = entrada.nextInt();
		
			resQuadrado1 = n * n;
			resQuadrado2 = n2 * n2;
			resQuadrado3 = n3 * n3;
			resQuadrado4 = n4 * n4;
			
			if (resQuadrado3 >= 1000) {
					System.out.println("c2 = " + resQuadrado3);
			}
			else {
			System.out.println("a = " + n);
			System.out.println("b = " + n2);
			System.out.println("c = " + n3);
			System.out.println("d = " + n4);
			System.out.println("a2 = " + resQuadrado1);
			System.out.println("b2 = " + resQuadrado2);
			System.out.println("c2 = " + resQuadrado3);
			System.out.println("d2 = " + resQuadrado4);
			}	
	}

}
