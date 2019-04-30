import java.math.BigInteger;
import java.util.Scanner;
public class Fatorial {
	public static void main(String[]args) {
		Scanner leia=new Scanner(System.in);
		
		BigInteger resultado=new BigInteger("1");
		BigInteger um=new BigInteger("1");
		BigInteger acumulador=new BigInteger("1");
		int numero=0;
		
		numero=leia.nextInt();
		
		for (int i=1 ; i<=numero; i++) {
		resultado=resultado.multiply(acumulador);
		acumulador=acumulador.add(um);
		}
		System.out.println(resultado);
		
	}
}
