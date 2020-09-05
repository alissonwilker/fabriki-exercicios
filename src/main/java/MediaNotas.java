import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MediaNotas {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		int qntNotas = scanner.nextInt();
		double[] notas = new double [qntNotas];
		double soma = 0;
		double media = soma/qntNotas;
		
		for (int i = 0; i < qntNotas; i++) {
		        double nota = scanner.nextInt();
		        notas[i] = nota;
		        soma += nota;
	}									
		System.out.println("media = " + formatador.format(media));
		
		for (int i = 0; i < qntNotas; i++) {
			System.out.println("nota " + formatador.format(notas[i]));
		}
	}
}		
