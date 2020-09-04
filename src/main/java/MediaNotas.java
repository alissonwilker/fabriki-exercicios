import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtdeNotas = scanner.nextInt();
		int nota[] = new int [qtdeNotas];
		double soma = 0;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		//leitura das notas
		for (int i=0;i<qtdeNotas;i++) {
			nota[i] = scanner.nextInt();}
		
		//calculo da soma das notas
		for (int i=0;i<qtdeNotas;i++) {
			soma +=nota[i];}
			
		//calculo da soma da média
		double media = soma / qtdeNotas;

		System.out.println("media = " + formatador.format(media));
		
		for (int i=0;i<qtdeNotas;i++) {
			System.out.println("nota " + (i+1) + " = " + formatador.format(nota[i]));}}}

