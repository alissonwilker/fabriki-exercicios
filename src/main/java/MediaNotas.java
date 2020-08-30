import java.util.Scanner;
import java.text.DecimalFormat;
class MediaNotas{
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");
    
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
    String md = df.format(media);
    System.out.println("media = "+md);
  
  	for(int i = 0; i < n; i++){
      System.out.println("nota "+ (i+1) +" = " + (double)notas[i]);
    }
  }
  
}
