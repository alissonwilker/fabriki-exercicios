import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int codigo = leitor.nextInt();
		int horaTrabalhada = leitor.nextInt();
		int salarioExcedente=0;
		leitor.close();
				
		if(horaTrabalhada > 50) {
			salarioExcedente = horaTrabalhada - 50;
			horaTrabalhada = horaTrabalhada - salarioExcedente;
			horaTrabalhada = (horaTrabalhada*10);
			salarioExcedente = salarioExcedente * 20;
		}else {
			horaTrabalhada = (horaTrabalhada*10);
		}
		
		int salarioTotal = salarioExcedente+horaTrabalhada; 
		
		System.out.println("codigo = "+codigo);
		System.out.println("salarioExcedente = "+salarioExcedente);
		System.out.println("salarioTotal = "+salarioTotal);
		
	}

}
