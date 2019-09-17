import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String args[]){
		int quantidade = entrada.nextInt();
		int[] notas = new int [quantidade];
		int media;
		int soma =0;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		
		for (int i = 0; i <= quantidade; i++) {
			notas[i]= entrada.nextInt();
			soma+=notas[i];
		}
		
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		media = soma/quantidade;
		System.out.println("media = " + formatador.format(media));
		for (int i=0; i<notas.length; i++) {
			saida.println("nota"+i+" = "+ formatador.format(notas[i]));
		}
	}
}
