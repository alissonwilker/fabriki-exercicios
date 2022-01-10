import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numeroDeNotas, notas = 0;
		double media = 0;
		
		System.out.println("Digite a quantidade de notas");
		numeroDeNotas = ent.nextInt();
		int notasRecebidas[] = new int[numeroDeNotas];
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		for (int i = 0; i < numeroDeNotas; i++) {
			System.out.println("Digite a " + (i+1) +"° nota");
			notasRecebidas[i] = ent.nextInt();
			notas += notasRecebidas[i];
		}
		
		media = (double) notas/numeroDeNotas;
		System.out.println("media = " + formatador.format(media));
		
		for (int i = 0; i < numeroDeNotas; i++) {
			System.out.println("nota " + (i+1) + " = "  + formatador.format(notasRecebidas[i]));

		}
		

	}
