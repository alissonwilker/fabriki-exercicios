
import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251{
	
		private static final Scanner entrada = new Scanner(System.in);
		private static final PrintStream saída = System.out;
		
		public static void main(String[] args) {

			int num = 0;
			int maior = Integer.MIN_VALUE;
		
			num= entrada.nextInt();
			
			while (num != 0){
				
				if (num !=0 && num > maior){
					maior = num;
				}
				
				num= entrada.nextInt();
			}
			System.out.print("maior = " + maior);
	}

}

