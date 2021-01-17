import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		double qtdeNotas = notas.nextInt();
		int n = notas.nextInt();
		int n2 = notas.nextInt();
		int n3 = notas.nextInt();
		int soma = n + n2 + n3;
		double media = soma / qtdeNotas;
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		System.out.println("media = " + formatador.format(media));
		System.out.println("nota 1 = " + formatador.format(n));
		System.out.println("nota 2 = " + formatador.format(n2));
		System.out.println("nota 3 = " + formatador.format(n3));
	}

}
