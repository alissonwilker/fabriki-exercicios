import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LerNumero  = new Scanner(System.in);
	
			int A = LerNumero.nextInt();
			int B = LerNumero.nextInt();
			int C = LerNumero.nextInt();
			int D = LerNumero.nextInt();
		
		
			int A2 = A * A;
			int B2 = B * B;
			int C2 = C * C;
			int D2 = D * D;
			
				if(C2 >= 1000) {
					System.out.println("c2 = " +C2);
					
				} else {
					System.out.println("a = "+A );
					System.out.println("b = "+B );
					System.out.println("c = "+C);
					System.out.println("d = "+D);
					System.out.println("a2 = "+A2);
					System.out.println("b2 = "+B2);
					System.out.println("c2 = "+C2);
					System.out.println("d2 = "+D2);
	    }
	}
}
