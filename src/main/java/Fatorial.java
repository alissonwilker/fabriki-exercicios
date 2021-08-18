import java.math.BigInteger;
import java.util.Random;

public class Fatorial{
    
    public static void main(String[] args) {
        Random numeros = new Random();
        int n1 = numeros.nextInt(25);
        BigInteger n2 = BigInteger.valueOf(n1);
        BigInteger fat = BigInteger.ONE;

        
       for(int i=1;i<=n1;i++){
         BigInteger n3 = BigInteger.valueOf(i);
         fat = fat.multiply(n3);

       }
       
       System.out.println(fat);
    }
    
}
