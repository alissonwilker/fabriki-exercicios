import java.util.Scanner;
public class LDP7143 {
		public static void main(String[] args) {	
			Scanner ler = new Scanner( System. in );				
			int a= ler.nextInt();			
			int b= ler.nextInt();							
			int c= ler.nextInt();							
			int d= ler.nextInt();
			ler.close();
			if ((c*c)>=1000) {
			System.out.println("c2 = "+(c*c));
			} else {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c = "+c);
			System.out.println("d = "+d);
			System.out.println("a2 = "+(a*a));
			System.out.println("b2 = "+(b*b));
			System.out.println("c2 = "+(c*c));
			System.out.println("d2 = "+(d*d));
		}
		}
}
