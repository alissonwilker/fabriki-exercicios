import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, horas, salExc = 0, salTotal = 0;
		
		codigo = sc.nextInt();
		horas = sc.nextInt();
		
		if (horas<=50) {
			salExc=0;
			salTotal=horas*10;
		}
		
		else if(horas>50) {
			salExc=(horas-50)*20;
			salTotal=500+salExc;
			
		}
		
		System.out.println("codigo = "+codigo);
		System.out.println("salarioExcedente = "+salExc);
		System.out.println("salarioTotal = "+salTotal);
	}

}
