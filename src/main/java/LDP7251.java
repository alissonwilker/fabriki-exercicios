
import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	
		private static final Scanner entrada = new Scanner(System.in);
		private static final PrintStream saída = System.out;
		
		public static void main(String[] args) {

			int num = 0;
			int maior = 0;
			
			System.out.print("DIGITE UM NUMERO OU 0 PARA SAIR: ");
			num= entrada.nextInt();
			
			while (num != 0){
				System.out.print("DIGITE UM NUMERO OU 0 PARA SAIR: ");
				num= entrada.nextInt();
				
				if (num >maior){
					maior = num;
				}
					
				System.out.print("O maior numero é...: " + maior);
			}
	}

}