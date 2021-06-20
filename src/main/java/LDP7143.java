import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LerNumero  = new Scanner(System.in);
		
			int N1 = LerNumero.nextInt();
			int N2 = LerNumero.nextInt();
			int N3 = LerNumero.nextInt();
			int N4 = LerNumero.nextInt();
		
		
			int Q1 = N1 * N1;
			int Q2 = N2 * N2;
			int Q3 = N3 * N3;
			int Q4 = N4 * N4;
			
				if(Q3 >= 1000) {
					System.out.println(Q3);
					
				} else {
					System.out.println(+ N1+" O valor  do seu quadrado é igual " + Q1);
					System.out.println(+ N2+" O valor do seu quadrado é igual " + Q2);
					System.out.println(+N3+ " O valor do seu quadrado é igual " + Q3);
					System.out.println(+N4+ " O valor do seu quadrado é igual " + Q4);
		
	    }
	}
}

