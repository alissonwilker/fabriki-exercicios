import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
class MediaNotas {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
	formatador.setMinimumFractionDigits(1);
	formatador.setMaximumFractionDigits(1);
    
    int n;
    int soma = 0;
    Double media;
    
    n = sc.nextInt();
    
    int notas[] = new int[n];
    
    for(int i = 0; i < n; i++){
      notas[i] = sc.nextInt();
      soma += notas[i]; 
    }
    
    media = ((double)soma) / ((double)n);
    System.out.println("media = "+formatador.format(media));
  
  	for(int i = 0; i < n; i++){
      System.out.println("nota "+ (i+1) +" = " + (double)notas[i]);
    }
  }
  
}
