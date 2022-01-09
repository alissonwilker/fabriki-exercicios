import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class MediaNotas {
public static void main(String[] args) {
 
		 NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		 formatador.setMinimumFractionDigits(1);
		 formatador.setMaximumFractionDigits(1);
 
try (Scanner entrada = new Scanner(System.in)) {
	int notas[] = new int [3];
 	int soma = 0, qtdeN, qtdeNO = 0;
 		qtdeN = entrada.nextInt();{
 			
	while (qtdeNO < qtdeN){
     qtdeNO ++;
 }
 
	 for (int i = 0; i < qtdeN; i++) {
	 notas[i] = entrada.nextInt();
	 soma += notas [i];
 }
  
	 double media = (( double)soma / qtdeN); 
	 	System.out.println("media = " + formatador.format(media));
	 
	 for (int i = 0; i < qtdeN; i++) {
		 System.out.println("nota " + (i+1)+ " = " + formatador.format(notas [i]));
		 
 }
}
}
}
}
