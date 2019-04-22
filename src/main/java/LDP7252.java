import java.math.BigInteger;
public class LDP7252 {

    public static void main(String[] args) {
        
        BigInteger cont = new BigInteger("2");
        BigInteger graos = BigInteger.ZERO;  
        for (int i = 0; i <= 63; i++) {  
            graos = graos.add(cont.pow(i));  
        }  
        System.out.println("totalGraos = "+graos);  
    }  
}
