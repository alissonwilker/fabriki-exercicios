import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int cod;
		int horas;
		int excedente;
		int total;
		int extra = 0;
		int salarionormal;

		cod = entrada.nextInt();
		horas = entrada.nextInt();

		if (horas > 50) {
			extra = horas - 50;
		}

		salarionormal = (horas-extra)*10; 
		excedente = extra*20;
		total = (excedente + salarionormal);
		
		saida.println("codigo = " + cod);
		saida.println("salarioExcedente = " + excedente);
		saida.println("salarioTotal = " + total);
	}

}
