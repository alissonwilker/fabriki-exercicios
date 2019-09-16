import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



public class MediaNotas {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade = entrada.nextInt();
		int[] nota = new int [quantidade];
		int soma = 0;
		double media;
		
		for(int i = 0; i < quantidade; i++) {
			nota[i] = entrada.nextInt();
			soma += nota[i];
		}
		media = soma/quantidade;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("nota "+(i+1)+" = "+formatador.format(nota[i]));
		}

	}

}
