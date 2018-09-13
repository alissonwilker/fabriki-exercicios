import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {

	
		private static Scanner entrada = new Scanner(System.in);
		private static PrintStream saida = System.out;

		public static void main(String[] args) {
			int n1 = entrada.nextInt();
			int n2 = entrada.nextInt();
			int n3 = entrada.nextInt();
			int n4 = entrada.nextInt();
			int quadradon1 = n1*n1;
			int quadradon2 = n2*n2;
			int quadradon3 = n3*n3;
			int quadradon4 = n4*n4;
			
			
			
			if(quadradon3 >= 1000){
				saida.println("c2 = " + quadradon3);
				
			}else{
				saida.println("a = " + n1 );
				saida.println("b = " + n2);
				saida.println("c = " + n3);
				saida.println("d = " + n4);
				saida.println("a2 = " + quadradon1 );
				saida.println("b2 = " + quadradon2);
				saida.println("c2 = " + quadradon3);
				saida.println("d2 = " + quadradon4);
			}
			

	}

}
