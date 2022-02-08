import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int qtdeNotas = scanner.nextInt();
		List<Integer> NotasLidas = new ArrayList<Integer>();
		
		int i = 0;
		int soma = 0;
		while (i < qtdeNotas) {
			NotasLidas.add(scanner.nextInt());
			soma = soma + NotasLidas.get(i);
			i++;
		}
		
		Collections.sort(NotasLidas);

		double media = (double)soma / qtdeNotas;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));

		int cont = 0;
		int pos = 0;
		while (cont < qtdeNotas) {
			pos = pos+1;
			System.out.println("nota " + pos + " = " + formatador.format(NotasLidas.get(cont)));
			cont = cont + 1;
		}
	}

}
