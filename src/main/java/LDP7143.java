import java.util.Scanner;
public class LDP7143 {
		public static void main(String[] args) {		
			Scanner aa = new Scanner( System. in );				
			int a= aa.nextInt();
			Scanner bb = new Scanner( System. in );				
			int b= bb.nextInt();
			Scanner cc = new Scanner( System. in );				
			int c= cc.nextInt();
			Scanner num = new Scanner( System. in );				
			int d= num.nextInt();
			int A=a*a;
			int B=b*b;
			int C=c*c;
			int D=d*d;
			if (C<1000) {
			System.out.println("a = " +a);
			System.out.println("b = " +b);
			System.out.println("c = " +c);
			System.out.println("d = " +d);
			System.out.println("a2 = " +A);
			System.out.println("b2 = " +B);
			System.out.println("c2 = " +C);
			System.out.println("d2 = " +D);
			} else {
				System.out.println("c2 = " +C);
			}
		}
		}
