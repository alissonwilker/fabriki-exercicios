import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int num  = entrada.nextInt();		
		entrada.close();		
		int fat = 1;

		for(int i = 1; i <= num; i++){
		fat = fat * i;
		}
		BigInteger resultado = BigInteger.valueOf(fat);
				
		System.out.println(resultado);
		}

	}
