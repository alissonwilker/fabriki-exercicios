import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        int num = 1;
        BigInteger fat = new BigInteger("1");

        num = ent.nextInt();

        for(int i = 1;i <= num; i++){
            fat = fat.multiply(new BigInteger(Integer.toString(i)));
        }

        System.out.println(fat);
    }
}
