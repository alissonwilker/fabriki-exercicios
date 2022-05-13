import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		BigInteger fat = BigInteger.ONE;
		Scanner entrada = new Scanner(System.in);		
		int num  = entrada.nextInt();		
		entrada.close();		
		

		for(int i = 1; i <= num; i++){
			fat = fat.multiply(BigInteger.valueOf(i));
				}
						
		System.out.println(fat);
		}

	}

