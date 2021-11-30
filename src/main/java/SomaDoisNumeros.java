import java.util.Scanner;

public class SomaDoisNumeros {
 
   public static void main( String[] args ) {
      int n1, n2, soma;
      
      Scanner s = new Scanner( System.in );
      
      System.out.println( "Digite um número: ");
      n1 = s.nextInt();
      System.out.println( "Digite um outro número: ");
      n2 = s.nextInt();

      soma = n1 + n2;
      
      System.out.println(soma);
   }
}
