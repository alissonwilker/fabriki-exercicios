import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		//Variáveis		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(2);		
		Scanner scan = new Scanner(System.in);
		int n,nt=0;
		double media=0;		
		
		//Lendo valor do usuario
		n = scan.nextInt(); 
		
		//Bloco de validaçção e execução
		if(n>0) { 
		double[]notas = new double[n];
		for(int i=0;i<n;i++) {	
			notas[i] = scan.nextDouble();
			media+= notas[i];			
		}	
			media /=(double)n;
			
			System.out.println("media = " + formatador.format(media));			
			
			for(int i=0;i<n;i++) {				
				nt++;				
				System.out.println("nota "+ nt +" = "+ formatador.format(notas[i]));}}
		
		
	}
		
 }
