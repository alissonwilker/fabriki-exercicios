import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	private static int n;

	public static void main(String[] args) {
		

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);
		
		formatador.setMaximumFractionDigits(1);
		Scanner entrada = new Scanner(System.in);

		
		int n = entrada.nextInt();
			
		int nota[] = new int[n];

		double soma = 0;
		double media = 0;

		for (int i = 0; i < nota.length; i++) {

			
			nota[i] = entrada.nextInt();

			
			soma += nota[i];
			media = soma / n;
		}
		System.out.println("media = " + formatador.format(media));
        for(int i =0; i < nota.length; i++) {
        	System.out.println("nota "+(i+1)+ " = "+formatador.format(nota[i]));

        }
         

		

	}

}
