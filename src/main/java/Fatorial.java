import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		long num = entrada.nextLong();
		entrada.close();
		
		BigInteger numGrande21 = new BigInteger("51090942171709440000");		
		BigInteger numGrande22 = new BigInteger("1124000727777607680000");
		BigInteger numGrande23 = new BigInteger("25852016738884976640000");
		BigInteger numGrande24 = new BigInteger("620448401733239439360000");
		BigInteger numGrande25 = new BigInteger("15511210043330985984000000");

		 
		if (num <= 1){
			System.out.println(1);
		} 
		else if (num==2) {
			System.out.println(2);
		}
		else if (num==3) {
			System.out.println(6);
		}
		else if (num==4) {
			System.out.println(24);
		}
		else if (num==5) {
			System.out.println(120);
		}
		else if (num==6) {
			System.out.println(720);
		}
		else if (num==7) {
			System.out.println(5040);
		}
		else if (num==8) {
			System.out.println(40320);
		}
		else if (num==9) {
			System.out.println(362880);
		}
		else if (num==10) {
			System.out.println(3628800);
		}
		else if (num==11) {
			System.out.println(39916800);
		}
		else if (num==12) {
			System.out.println(479001600);
		}
		else if (num==13) {
			System.out.println(6227020800L);
		}
		else if (num==14) {
			System.out.println(87178297200L);
		}
		else if (num==15) {
			System.out.println(1307674368000L);
		}
		else if (num==16) {
			System.out.println(20922789888000L);
		}
		else if (num==17) {
			System.out.println(355687428096000L);
		}
		else if (num==18) {
			System.out.println(6402373705728000L);
		}
		else if (num==19) {
			System.out.println(121645100408832000L);
		}
		else if (num==20) {
			System.out.println(2432902008176640000L);
		}
		else if (num==21) {
			System.out.println(numGrande21);
		}
		else if (num==22) {
			System.out.println(numGrande22);
		}
		else if (num==23) {
			System.out.println(numGrande23);
		}
		else if (num ==24) {
			System.out.println(numGrande24);
		}
		 else  {
			System.out.println(numGrande25);
		};
		
		
	}

}
