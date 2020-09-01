import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MediaNotas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		     	
	        double media = 0;
	        int quantidade = scanner.nextInt();
	        int vetor[];
	        vetor=new int[quantidade];
	        for(int i=0 ; i <quantidade ; i++){
	           
	            vetor[i]= scanner.nextInt();
	        }
	        for(int i=0 ; i <quantidade ; i++){
	            media = media + vetor[i];
	        }
	        media = media / (double)quantidade;
	        
	        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " +formatador.format(media));
			
			for(int i=0; i<quantidade; i++) {
			System.out.println("nota "+(i+1)+" = "+formatador.format(vetor[i]));

			}
	
	}
}
