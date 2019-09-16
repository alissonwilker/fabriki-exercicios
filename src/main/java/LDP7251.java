import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[1000], i = 0;
		
		num[i] = entrada.nextInt();
		int maior = num[i];
		while(num[i] != 0) {
			num[i] = entrada.nextInt();
			
			if(num[i] == 0) {
				break;
			}
			if (num[i] > maior) {
				maior = num[i];
			}
		}

		saida.println("maior = " + maior);
	}

}
