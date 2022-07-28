import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		List<Integer> not1 = new ArrayList<Integer>();

		int qtdNotas, notas, i, j =1;
		qtdNotas = entrada.nextInt();


		for (i = 0; i < qtdNotas; i++) {
			notas = entrada.nextInt();
			not1.add(notas);	
		}

		double soma = 0;
		for (Integer elementos : not1)
			soma += elementos;

		double media = soma / qtdNotas;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);

		System.out.println("media = " + formatador.format(media));


		for (Integer elementos : not1)
		System.out.println("nota " + (j++) +" = " + formatador.format(elementos));
	}	
}
