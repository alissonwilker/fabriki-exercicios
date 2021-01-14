import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int Qn, n1, n2, soma;
	
	
	Qn = entrada.nextInt();
	if (Qn > 0) {
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		soma = n1 + n2;
		double Q = Qn;
		double media = soma / Q;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));
		System.out.println ("nota 1 = "+ formatador.format(n1));
		System.out.println ("nota 2 = "+ formatador.format(n2));
	}
	

	

}

}
