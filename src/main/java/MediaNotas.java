import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.lang.Math;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//variaveis
		double qtdeNotas = 1;
		double soma=0 , numero = 0;
		
		//entrada de dados
		System.out.print("");
		double qtf = entrada.nextInt();
		
		//em teoria o calculo.
		soma = qtf + numero;double media = soma / qtdeNotas;
		
		//format
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		//resto do código
		while (qtdeNotas <= qtf) {
		System.out.print("");
		entrada.nextFloat();
			
			qtdeNotas++;
		
		}
		System.out.println("media = " + formatador.format(media));
		System.out.println("nota "+ formatador.format(qtdeNotas));
	}

}
