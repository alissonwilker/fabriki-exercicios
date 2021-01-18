import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
    int n = 0;
    double soma = 0;
    
	//ENTRADA:
    
	System.out.printf("");
    n = entrada.nextInt();
    
    int[] notas = new int[n];
    for (int i = 0; i < n; i++) {
    	System.out.printf("");
	    notas[i] = entrada.nextInt();
	    soma = soma + notas[i];
    }
    
    //SAÍDA:
    
    double media = soma / n;
    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
    formatador.setMinimumFractionDigits(1);
    formatador.setMaximumFractionDigits(1);
    System.out.println("media = " + formatador.format(media));
    int j = 0;
	    while (j < notas.length) {
	    	System.out.println("nota " + (j+1) + " = " + formatador.format(notas[j]));
	        j++;
	    }
 	}
}
