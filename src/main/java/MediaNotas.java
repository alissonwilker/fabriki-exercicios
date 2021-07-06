import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas { 
             public static void main(String[ ] args) { 

                Scanner lerNumeros = new Scanner(System.in);
                double notas = 0;
                double notasAlunos = 0;  
                int contador = lerNumeros.nextInt();
                double[] pegaNotas = new double[contador];
                int[] pegaAlunos = new int[contador];
              
                for(int i = 0; i < contador; i++) {
                       notas = lerNumeros.nextInt();
                       pegaNotas [i] = notas;  
		       pegaAlunos [i] = i+1;
		       notasAlunos += notas;

                  }
		   
		   double media = notasAlunos /contador;	                   

		   NumberFormat formatador = NumberFormat.getInstance(new Locale("pt" , "BR"));

                   formatador.setMinimumFractionDigits(1);

                   formatador.setMaximumFractionDigits(1);

	       
                   System.out.println("media = "   + formatador.format(media ));
                   for(int i = 0;  i < contador;  i++) 
                   System.out.println(" nota  " +  pegaAlunos[i] + " = " + formatador.format(pegaNotas[i] ));                                                                              

                             
      }                  
   }                       
}
