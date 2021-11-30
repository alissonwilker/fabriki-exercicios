import java.util.Scanner;
 
public class SomaDoisNumeros {
 
   public static void main( String[] args ) {
      int num1, num2;
      Scanner s = new Scanner( System.in );
      num1 = s.nextInt();
      num2 = s.nextInt();
      
      int result = num1 + num2;
      
      System.out.println( result );
   }
}
