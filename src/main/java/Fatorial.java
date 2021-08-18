import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial{
    
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        BigInteger n1 = BigInteger.valueOf(numeros.nextInt());
        BigInteger fat = BigInteger.ONE;

        
       for(int i=1;i<=n1.intValue();i++){
         BigInteger n3 = BigInteger.valueOf(i);
         fat = fat.multiply(n3);

       } 
       
    
       System.out.println(fat);
       System.out.println("");
    }
    
}
