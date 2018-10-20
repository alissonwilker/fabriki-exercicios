import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = 1, n = 0, num = 0;
		numero = entrada.nextInt();
		
		while(numero!=0){
			num = numero;
			n = entrada.nextInt();
			
			if(n>num){
				num = n;
				
			}else if(numero>num){
				num = numero;
				
			}
			numero = entrada.nextInt();
		}
		saida.println("maior = " + num);

	}

}
