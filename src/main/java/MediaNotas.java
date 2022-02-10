import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double media = 0; 
		double soma = 0;
		int qtd = sc.nextInt();
		int [] nota = new int [qtd];
		for (int i = 0; 1 < qtd; i++) 
		{nota[1] = sc.nextInt();
		soma += nota[i];	
		}
	media = soma / qtd; 
	NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
	formatador.setMinimumFractionDigits(1);
	formatador.setMaximumFractionDigits(1);
	System.out.println("media = " + formatador.format(media));
	
	for (int i = 0; i < nota.length; i++) 
	{System.out.println("nota = " + (i+1) + " = " + formatador.format(nota[i]));}
	sc.close();
	}}
