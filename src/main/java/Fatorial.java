import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger x = new BigInteger(scanner.next());
        BigInteger f = x; 
        
        if(x.equals(BigInteger.ZERO)) {
            System.out.println(1);
            return;
        }else{
            while (x.compareTo(BigInteger.ONE) > 0) {
                f = f.multiply(x.subtract(BigInteger.ONE));
                x = x.subtract(BigInteger.ONE);
            }
        }
        System.out.println(f); 
    }

}
