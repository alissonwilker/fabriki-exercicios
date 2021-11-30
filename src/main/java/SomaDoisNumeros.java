import java.util.Scanner;
 
public class SomaDoisNumeros {
 
   public static void main( String[] args ) {
      int num1, num2;
      Scanner s = new Scanner( System.in );
      System.out.println( "Digite um número ");
      num1 = s.nextInt();
      System.out.println( "Digite outro número ");
      num2 = s.nextInt();
      
      int result = num1 + num2;
      
      System.out.println( result );
   }
}
