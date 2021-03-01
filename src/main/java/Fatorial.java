import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
		
		int numero;
	
		Scanner input = new Scanner(System.in);
		numero = input.nextInt();
		input.close();
		
		if (numero < 0 || numero > 25)
			input.close();
		else {
	        System.out.println(fatorialInterativo(numero));
		}
    }
    
    private static BigInteger fatorialInterativo(int n){
        if(n == 0) return BigInteger.ONE;        
        BigInteger fatorial = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            BigInteger indice = BigInteger.valueOf(i);
            fatorial = fatorial.multiply(indice);
        }
        return fatorial;
    }
}
