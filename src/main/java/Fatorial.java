
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
	Scanner valores = new Scanner(System.in);
	int num = valores.nextInt();
	valores.close();
	BigInteger fatorial = BigInteger.valueOf(num);
	if (num==0) {
		fatorial = BigInteger.valueOf(1);}
	else {
	 for (int i=(num-1); i>=1; i--) { 
	fatorial =fatorial.multiply(BigInteger.valueOf(i));
    }  } 
    System.out.println (fatorial);    
}
}

