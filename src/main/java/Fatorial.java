import java.math.BigInteger;
import java.util.Random;

public class Fatorial{
    
    public static void main(String[] args) {
        Random numeros = new Random();

        BigInteger n1 = BigInteger.valueOf(numeros.nextInt(25));
        BigInteger fat = BigInteger.ONE;

        
       for(int i=1;i<=n1.intValue();i++){
         BigInteger n3 = BigInteger.valueOf(i);
         fat = fat.multiply(n3);

       }
       System.out.println(n1);
       System.out.println(fat);
    }
    
