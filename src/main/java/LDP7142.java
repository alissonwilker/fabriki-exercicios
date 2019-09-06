import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class LDP7142 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		//hora trabalhada = 10 
		//hora extra > 50
		//ganho apartir da hora extra = 20;
		
		int codigo = entrada.nextInt();
		int horasTrabalho = entrada.nextInt();
		
		int salarioExcedente = 0, salarioTotal = 0, horasExcedentes = 0;
		
		if(horasTrabalho > 50) {
			horasExcedentes = horasTrabalho - 50;
			salarioExcedente = horasExcedentes*20;
			salarioTotal = 10*(horasTrabalho - horasExcedentes) + salarioExcedente;
		}else {
			salarioTotal = (10*horasTrabalho);
		}
		
		saida.println("codigo = "+codigo);
		saida.println("salarioExcedente = "+salarioExcedente);
		saida.println("salarioTotal = "+salarioTotal);
	}

}
