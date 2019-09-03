import java.math.BigInteger;
import java.util.Scanner;


public class Fatorial2 {
    public static void main(String[] args){
    
        Scanner ent = new Scanner(System.in);
        
        int num;
        BigInteger fat = BigInteger.ONE;
        num = ent.nextInt();
        
        
         
            for( int i=2 ;1 <= num; i++){
            fat = fat.multiply( BigInteger.valueOf(i));
            }
            
            System.out.println("!" + num + " = " + fat);     
    }
}
