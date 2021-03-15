import java.util.Scanner;

public class LDP7143 {

		public static void main(String[] args) {
		 
			int a = 0, a2, b = 0, b2, c = 0, c2, d = 0, d2 ;
			
			Scanner scanner = new Scanner(System.in);		
			
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			d = scanner.nextInt();
			
			 a2 = a*a;
			 b2 = b*b;
			 c2 = c*c;
			 d2 = d*d;
					
			 if(c2 >= 1000){ 
				 System.out.println("c2 = " + c2);
			 }
			 else{ 
				 if(c2 < 1000) 
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
