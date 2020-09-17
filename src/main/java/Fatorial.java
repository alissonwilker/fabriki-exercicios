import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
		 double num;
		 
		 num = sc.nextInt();
		 
		 if (num==0) {
			 System.out.println("1");
		 }
		 
		 else if (num>0 && num<26) {
			 double a = num-1;
			 while(a>0) {
				num = num*a;
				a--;}
			 BigInteger k = BigDecimal.valueOf(num).toBigInteger();
			 System.out.println(k);}
		

	}
}
