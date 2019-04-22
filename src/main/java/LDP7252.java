import java.math.BigInteger;
public class LDP7252 {
    public static void main(String[] args) {
        BigInteger x=new BigInteger("1"),y=new BigInteger("0"),dois=new BigInteger("2"),um=new BigInteger("-1");
        for(int i=1;i<64;i++){
            x=(x.multiply(dois));
            y=(x.add(x));
        }
        y=(y.add(um));
        System.out.println("totalGraos = "+y);
        
    }
    
}
