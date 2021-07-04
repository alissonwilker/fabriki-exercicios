import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class MediaNotas {
public static void main(String[] args) {
	Locale.setDefault(new Locale("pt","BR"));
	DecimalFormat df = new DecimalFormat("0.0");
	df.setRoundingMode(RoundingMode.HALF_UP);
	Scanner s = new Scanner( System. in );
	int qtdeNotas=s.nextInt();
		int [] notas = new int[qtdeNotas];
		for (int i=0;i<notas.length;i++) {
		notas[i] = s.nextInt();	}
	s.close();
	double soma=0;
	for (int j = 0; j < notas.length; j++) {
			 soma= soma+notas[j];}
	 double media = soma/notas.length	;
	 System.out.println("media = " +df.format(media));
	 for (int j = 0; j < notas.length; j++) {
		   System.out.println("nota "+ (j +1) +" = " +df.format(notas[j])); }
}
}
