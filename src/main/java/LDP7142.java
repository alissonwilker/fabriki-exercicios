import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo, horas, excedente, salario;
		
		codigo=entrada.nextInt();
		horas=entrada.nextInt();
		
		if (horas>50) {
			excedente=(horas-50)*20;
			salario=500+excedente;
			
		} else {
			excedente=0;
			salario=10*horas;
			
		}
		
		saida.println("codigo = "+codigo);
		saida.println("salarioExcedente = "+excedente);
		saida.println("salarioTotal = "+salario);
		
		
	}
	
	

}
