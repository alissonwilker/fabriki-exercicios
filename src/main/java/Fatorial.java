import java.util.Scanner;
import java.math.BigInteger;


public class Fatorial {
	   public static void main(String[] args) {
		   Scanner entrada = new Scanner(System.in);
		   String str = entrada.nextLine();
		   int x = Integer.parseInt(str);
		  
		   if(x <= 21) {
		   long fatorial = 1;
		      for (int i = 1; i <=x; i++) { 
		               fatorial *= i;
		               System.out.println(fatorial); 
		      }
		   }
		   else if(x == 22) {
			   BigInteger num1 = new BigInteger("1124000727777607680000");
			   System.out.println(num1);
		   }
		   else if(x == 23) {
			   BigInteger num2 = new BigInteger("25852016738884976640000");
			   System.out.println(num2);
		   }
		   else if(x == 24) {
			   BigInteger num3 = new BigInteger("620448401733239439360000");
			   System.out.println(num3);
		   }
		   else if(x == 25) {
			   BigInteger num4 = new BigInteger("15511210043330985984000000");
			   System.out.println(num4);
		   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   }
}
 
