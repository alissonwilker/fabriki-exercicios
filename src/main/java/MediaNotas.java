import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		Scanner entrada = new Scanner(System.in);
		
		int[] nota = new int[1000];
		double soma = 0, qtdeNotas,notas,qnotas=0 ;
		
		qtdeNotas = entrada.nextInt();{
			
		while (qnotas < qtdeNotas ) {
			qnotas++;
		}

		for(int indice = 0; indice < qtdeNotas; indice++) {
			nota[indice] = entrada.nextInt();
		}

		for(int indice = 0; indice < qtdeNotas ; indice++) {
			System.out.println("nota "+ (indice+1) + " = "  + formatador.format(nota[indice]));
			soma += nota[indice];
		}
		double media = soma / qtdeNotas;
		System.out.println("media = " + formatador.format(media));
	}
}
	}
