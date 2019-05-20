import java.util.Scanner;

public class LDP7142 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int n, m1, m2, salex = 0, salto = 0;
		
		n = s.nextInt();
		m1 = s.nextInt();
		
		s.close();
		
		if(m1 > 50) {
			m2 = m1 - 50;
			
			salex = m2*20;
			salto = salex + 50*10;
		}
		else {
			salto = m1*10;
		}
		
		System.out.println("codigo = "+n);
		System.out.println("salarioExcedente = "+salex);
		System.out.println("salarioTotal = "+salto);
	}

}
