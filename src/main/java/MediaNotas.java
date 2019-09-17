import java.util.Locale;
import java.util.Scanner;
import java.io.PrintStream;
import java.text.NumberFormat;
public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		double soma=0;
		int qtd=entrada.nextInt();
		int [ ] a =new int[qtd];
		
		
		
		if(qtd>0) {
			for(int i=0;i<qtd;i++) {
				a[i]=entrada.nextInt();
				soma=a[i]+soma;
			}
		}
		double media = soma / qtd;
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);
		

		System.out.println("media = " + formatador.format(media));
		
		for(int j=1;j<a.length+1;j++) {
			saida.println("nota "+j+" = "+formatador.format(a[j-1]));
		}
		
	}

}
