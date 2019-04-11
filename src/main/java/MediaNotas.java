import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Digite a quantidade de alunos:");
		int n = s.nextInt();
		
		int[] notas = new int[n];
		
		for (int i = 0; i < n; i++) {
			notas[i] = s.nextInt();
		}
		
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma = soma +notas[i];
		}
		
		//double media = soma/n;
		//System.out.println("media = "+ media);
		// System.out.println("notas "+[i]+" ="+ notas[i]);
		
		double media = soma / n;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));
			for (int i = 0; i < notas.length; i++) {

				System.out.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
		}
		
	}

}
