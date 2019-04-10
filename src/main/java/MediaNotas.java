import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



public class MediaNotas {
  public static void main(String[] args) {
   
   Scanner S = new Scanner(System.in);
   
   double media = 0;
   
   
   int n = S.nextInt();
   
   int[] alunos;
   alunos = new int[n];

   
   for(int i = 0; i < n; i++) {
	   
	   int nota = S.nextInt();
	   
	   alunos[i] = nota;
	   media += alunos[i];
	  // System.out.println("Soma das notas " + media);
   }
   
   
   media = (media/alunos.length);
   NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
   
   formatador.setMinimumFractionDigits(1);

   formatador.setMaximumFractionDigits(1);

   System.out.println("media = " + formatador.format(media));
   
   for(int i = 0; i<n; i++) {
	   System.out.println("nota "+ (i+1) +" = " + formatador.format(alunos[i]));
   }
   
  


   
   
  
    }
  }
