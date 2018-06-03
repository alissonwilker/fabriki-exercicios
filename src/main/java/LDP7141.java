import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada =new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int multa=0;
		int exedente=0;
		int kilo=0;
		saida.print("Digite o Kg do peixe :");
		kilo= entrada.nextInt();
		entrada.close();
		if(kilo>0 && kilo>50) {

		exedente = kilo-50;
		multa = exedente*4;
		
			saida.println("ENTRADA  SAÍDA");
			saida.print(kilo+"      ");
			saida.print(" exedente = "+exedente+"\n         multa = "+multa);
			
		}else {
			saida.println("ENTRADA  SAÍDA");
			saida.print(kilo+"      ");
			saida.print(" exedente = "+exedente+"\n         multa = "+multa);
			
		}
	
	}

}