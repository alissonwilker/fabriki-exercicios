import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("");
		int alunos = s.nextInt();
		
		double[] notas = new double[alunos];
		
		for (int i = 0; i < alunos; i++) {
			notas[i] = s.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma = soma +notas[i];
		}
		
		double media = soma/alunos;
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));
		
		for (int i = 0; i < notas.length; i++) { 
		
		System.out.println("nota "+(i+1)+" = "+formatador.format(notas[i]));

	}

  }
}
