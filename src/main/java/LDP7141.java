import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int p,e = 0,m = 0;
		p = entrada.nextInt();
		
		if(p>50){
		e = (p-50);
		m = (e*4);
		}
			saida.println("PESO TOTAL = "+p);
			saida.println("EXCEDENTE = "+e);
			saida.println("MULTA = "+m);
			
		}
	}
