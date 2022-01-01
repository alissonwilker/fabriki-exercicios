import java.util.Scanner;

public class MediaNotas{
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String args[]) {
      int qtdeNotas, soma=0;
      int  notas[] = new int[0];
      double media = soma / qtdeNotas;
      
      qtdeNotas = entrada.nextInt();
      
        for(int i= 0; i< qtdeNotas; i++) {
        	notas[i] = entrada.nextInt();
        	soma += notas[i];
        }
      System.out.println("media = "+ media);
    }
}
