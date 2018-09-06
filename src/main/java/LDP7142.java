import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	public static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int codigo = 0, horas = 0, excedente = 0, salarioExcedente = 0, salari = 0, salarioTotal = 0;
		
		codigo = entrada.nextInt();
		horas = entrada.nextInt();
		
		if (horas > 50){
			excedente = (horas-50);
			salarioExcedente = (excedente*20);
			salari = (50*10);
			salarioTotal = (salari+salarioExcedente);
		}else{
			salarioTotal = (horas*10);
			salarioExcedente = 0;
		}
		
		saida.println("codigo = "+codigo);
		saida.println("salarioExcedente = "+salarioExcedente);
		saida.println("salarioTotal = "+salarioTotal);
				

	}

}