import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int cod = entrada.nextInt();
		int horas = entrada.nextInt();
		int salarioExcedente = 0;
		int salarioTotal;
		if(horas>50) {
			salarioExcedente = ((horas-50)*20);
			salarioTotal = 500 + salarioExcedente;
		}else {
			salarioTotal = horas*10;
		}
		saida.println("codigo = "+cod);
		saida.println("salarioExcedente = "+salarioExcedente);
		saida.println("salarioTotal = "+salarioTotal);
	}
}
