import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int quantnotas;
		int soma = 0;
		System.out.print("Informe a quantidade de notas a serem lidas: ");
		quantnotas = entrada.nextInt();
		int [] notas = new int[quantnotas];
		if (quantnotas <= 0) {
			System.out.println("O valor informado deve ser maior que zero.");
		} else {
			for (int i = 0; i < quantnotas; i++) {
				System.out.print("Informe a nota " + (i+1) + ": ");
				notas[i] = entrada.nextInt();
				soma += notas[i];
			}
			double medianotas = soma/quantnotas;
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);
			System.out.println("Média = " + formatador.format(medianotas));
			Arrays.sort(notas);
			for (int i = 0; i < quantnotas; i++) {
				System.out.println("Nota " + (i+1) + " = " + formatador.format(notas[i]));
			}
		}		
	}
}
