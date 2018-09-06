import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int cod=0, hs=0,se=0;
	
	cod = entrada.nextInt();
	

	hs = entrada.nextInt();
	
	if(hs > 50){
	se=((hs-50)*20);
	
	System.out.println("codigo = "+cod);
	System.out.println("salarioExcedente = "+se);
	System.out.println("salarioTotal = "+((50*10)+se));
	
	}else{
	saida.println("codigo = "+cod);
	saida.println("salarioExcedente = "+se);
	saida.println("salarioTotal = "+(hs*10));	
	}
	
	}
}