import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Nota1 = 2;
		//int Nota2 = 1;
		
		Scanner scanner = new Scanner(System.in);
		
	
		int nota1 = scanner.nextInt();
		int nota2 = scanner.nextInt();
		
		double media  =  (double) nota1+nota2/2;
		
		int i;			
		for(i = 0; i > 0; i++){
		}
		 
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));
		System.out.println("nota 1= " + formatador.format(nota1));
			
		

	}

}
