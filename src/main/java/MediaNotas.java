import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int Qn, n1, n2,n3, soma;
	double Q, media;
	
	Qn = entrada.nextInt();
	if (Qn > 0) {
		switch (Qn) {
		case 1:
			n1 = entrada.nextInt();
			Q = Qn;
			media = n1 / Q;
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			
			formatador.setMinimumFractionDigits(1);
	
			formatador.setMaximumFractionDigits(1);
			System.out.println("media = " + formatador.format(media));
			System.out.println ("nota 1 = "+ formatador.format(n1));
		case 2:
			n1 = entrada.nextInt();
			n2 = entrada.nextInt();
			soma = n1 + n2;
			Q = Qn;
			media = soma / Q;
			NumberFormat formatador2 = NumberFormat.getInstance(new Locale("pt", "BR"));
	
			formatador2.setMinimumFractionDigits(1);
	
			formatador2.setMaximumFractionDigits(1);
			System.out.println("media = " + formatador2.format(media));
			System.out.println ("nota 1 = "+ formatador2.format(n1));
			System.out.println ("nota 2 = "+ formatador2.format(n2));
		break;
		case 3:
			n1 = entrada.nextInt();
			n2 = entrada.nextInt();
			n3 = entrada.nextInt();
			soma = n1 + n2 +n3;
			Q = Qn;
			media = soma / Q;
			NumberFormat formatador3 = NumberFormat.getInstance(new Locale("pt", "BR"));
	
			formatador3.setMinimumFractionDigits(1);
	
			formatador3.setMaximumFractionDigits(1);
			System.out.println("media = " + formatador3.format(media));
			System.out.println ("nota 1 = "+ formatador3.format(n1));
			System.out.println ("nota 2 = "+ formatador3.format(n2));
			System.out.println ("nota 3 = "+ formatador3.format(n3));
		}
	}
	

	

}

}
