import java.io.PrintStream;
import java.math.BigInteger;


public class LDP7252 {

    private static final PrintStream saida = System.out;
    public static void main(String[] args) {
      
        BigInteger vetor[] = new BigInteger[64];
          
           vetor[0] = BigInteger.valueOf(1);
          
        for (int i = 1; i <= 63; i++) {
            
            vetor[i] = (vetor[i-1].multiply(BigInteger.valueOf(2)));
          }
         BigInteger soma= new BigInteger("1");
       
         for(int i =1; i< vetor.length; i++){
            soma = soma.add (vetor[i]);
        }
        
         saida.println(soma);    
    }
 }
   
