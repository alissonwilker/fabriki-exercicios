import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class MediaNotas {
	public static void main(String[] args) {
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));		
		Scanner entrada = new Scanner(System.in);		
		int quantNotas = entrada.nextInt();		
		int [] notas = new int [quantNotas];
	

		for(int i=0; i<quantNotas; i++) {			
		notas[i] = entrada.nextInt();		}		
		entrada.close();
		double soma = Arrays.stream(notas).sum(); 
		double media = soma/quantNotas;
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));
		for (int i=0; i < notas.length; i++) {		
		System.out.println("nota "+(i+1)+" = "+formatador.format(notas[i]));	
		}
}
}
