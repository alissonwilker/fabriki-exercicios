import java.util.Scanner;
 
public class LDP7144.java {
 
   public static void main( String[] args ) {
      int num;
      String parOuImpar, posNeg;
      Scanner s = new Scanner( System.in );
      num = s.nextInt();
      
      if (num%2 == 0) {
          parOuImpar = "PAR";
      } else {
          parOuImpar = "ÍMPAR";
      }
      
      if (num < 0) {
         posNeg = "NEGATIVO"; 
      }else {
          posNeg = "POSITIVO";
      }
      
      System.out.println(parOuImpar + " E " + posNeg);
   }
}
