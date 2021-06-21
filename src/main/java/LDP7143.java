import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LerNumero  = new Scanner(System.in);
	
			int A = LerNumero.nextInt();
			int B = LerNumero.nextInt();
			int C = LerNumero.nextInt();
			int D = LerNumero.nextInt();
		
		
			
			
				if(C * C >= 1000) {
				System.out.println("c2 = " + C * C);
					
				} else {
					     System.out.println("a = "+A);
					     System.out.println("b = "+B);
					     System.out.println("c = "+C);
					     System.out.println("d = "+D);
					     System.out.println("a2 = "+ (A*A) );
					     System.out.println("b2 = "+ (B*B) );
					     System.out.println("c2 = "+ (C*C) );
					System.out.println("d2 = "+ (D*D) );
	    }
	}
}
