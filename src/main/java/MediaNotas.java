import java.util.Scanner;
import java.text.DecimalFormat;
class MediaNotas {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");
    
    int qntNotas;
    int soma = 0;
    Double media;
    
    qntNotas = sc.nextInt();
    
    int notas[] = new int[qntNotas];
    
    for(int i = 0; i < qntNotas; i++){
      notas[i] = sc.nextInt();
      soma += notas[i]; 
    }
    
    media = ((double)soma) / ((double)qntNotas);
    String md = df.format(media);
    System.out.println("media = "+md);
  
  	for(int i = 0; i < qntNotas; i++){
      System.out.println("nota "+ (i+1) +" = " + (double)notas[i]);
    }
  }
  
}
