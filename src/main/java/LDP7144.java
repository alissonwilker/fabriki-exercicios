import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static PrintStream saida = System.out;
	private static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
            saida.println("O número é par");
        } else {
            saida.println("O número é impar");
        }
 
        if (num >= 0) {
            saida.println("O número é positivo");
        } else {
            saida.println("O número é negativo");
        }
		
	}
}
