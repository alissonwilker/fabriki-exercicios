import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod = scan.nextInt();
		int hs = scan.nextInt();
		int salExcedente;
		int salTotal;
		
		
		if(hs >=0 && hs<= 50) {
			salExcedente = 0;
			salTotal = hs*10;
		}else  {
			salExcedente = (hs-50)*20;
			salTotal = 500+salExcedente;
			
		}
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+salExcedente);
		System.out.println("salarioTotal = "+salTotal);
		
	}

}
