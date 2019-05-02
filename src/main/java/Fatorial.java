import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		BigInteger totalfat = new BigInteger("1");
		BigInteger ref = new BigInteger("1");
		BigInteger acumulador = new BigInteger("1");
		
		int valor = 0;
		valor = entrada.nextInt();

		for (int cont = 1; cont <= valor; cont++) {
			totalfat = totalfat.multiply(acumulador);
			acumulador = acumulador.add(um);
		}
		
		System.out.println(totalfat);
	}
}
