import java.util.Scanner;
public class LDP7143 {
		public static void main(String[] args) {	
			Scanner ler = new Scanner( System. in );				
			int a= ler.nextInt();			
			int b= ler.nextInt();						
			int c= ler.nextInt();							
			int d= ler.nextInt();
			int A=a*a;
			int B=b*b;
			int C=c*c;
			int D=d*d;
			if (C>=1000) {
			System.out.print("c2 = " +C);
			} else {
			System.out.println("a = " +a);
			System.out.println("b = " +b);
			System.out.println("c = " +c);
			System.out.println("d = " +d);
			System.out.println("a2 = " +A);
			System.out.println("b2 = " +B);
			System.out.println("c2 = " +C);
			System.out.println("d2 = " +D);
		}
		}
}
		
