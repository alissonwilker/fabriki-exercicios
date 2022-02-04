import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int quantnotas;
		int soma = 0;
		quantnotas = entrada.nextInt();
		int [] notas = new int[quantnotas];
		if (quantnotas > 0) {
			for (int i = 0; i < quantnotas; i++) {
				notas[i] = entrada.nextInt();
				soma += notas[i];
			}
			
			double medianotas = (double)soma / quantnotas;
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);
			System.out.println("media = " + formatador.format(medianotas));
			Arrays.sort(notas);
			for (int i = 0; i < quantnotas; i++) {
				System.out.println("nota " + (i+1) + " = " + formatador.format(notas[i]));
			}
		}		
	}
}
