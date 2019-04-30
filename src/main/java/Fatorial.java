import java.math.BigInteger;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        BigInteger c=new BigInteger("1");
        BigInteger j=new BigInteger("1");
        BigInteger UM=new BigInteger("1");
        int num;
        Scanner leia=new Scanner(System.in);
        num=leia.nextInt();
        if (num==0){
            System.out.println(1);
        }
        else{ 
            for(int i=1;i<=num;i++){
                c =c.multiply(j);
                j=j.add(UM);
            }
            System.out.println(c);
        }
    }
}
