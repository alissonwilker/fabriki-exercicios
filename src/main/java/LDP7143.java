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
					System.out.println("C2 =" +C2);
					
				} else {
					System.out.println("A =" +A );
					System.out.println("B = "+B );
					System.out.println("C =" +C);
					System.out.println("D =" +D);
					System.out.println("A2 =" +A2);
					System.out.println("B2 =" +B2);
					System.out.println("C2 =" +C2);
					System.out.println("D2 =" +D2);
	    }
	}
}
