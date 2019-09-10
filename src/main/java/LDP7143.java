import java.util.Scanner;
import java.io.PrintStream;


public class LDP7143 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[4];
		int[] n2 = new int[4];
		
		String[] letra = new String[4];
		
		letra[0] = "a";
		letra[1] = "b";
		letra[2] = "c";
		letra[3] = "d";
		
		for (int i = 0; i <= 3; i++) {
			n[i] = entrada.nextInt();
			n2[i] = n[i]*n[i];
		}
		
		if(n2[2] > 1000) {
			
			saida.println(letra[2]+"2 = "+n2[2]);
		
			
		}else {
				
		for(int i = 0; i <=3; i++) {
			saida.println(letra[i]+" = "+n[i]);
		}
		
		for(int i = 0; i <= 3; i++) {
				
			saida.println(letra[i]+"2 = "+n2[i]);
			
			
		}
		}

	}

}
