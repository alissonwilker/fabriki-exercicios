import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		byte x;
		BigInteger fat = BigInteger.ONE; 
		
		x = sc.nextByte();
		sc.close();
	
		for (byte i = 1;i <= x; i++)
		{fat = fat.multiply(BigInteger.valueOf(i));} 
	 
		System.out.println(fat);
		
	}} 
