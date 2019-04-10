
import java.text.NumberFormat;
import java.util.*;
public class MediaNotas {
	public static void main (String[] args) {
		int qNotas,total = 0;
		Scanner input= new Scanner(System.in);
		qNotas=input.nextInt();
		
		
		int notas[] = new int[qNotas];
		
		for (int i = 0; i < notas.length; i++) {
			notas[i]=input.nextInt();
			total+= notas[i];
		}
		
	
		double media = total / qNotas;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));
	}

}
