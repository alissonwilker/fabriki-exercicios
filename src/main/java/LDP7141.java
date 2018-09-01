import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float p,e;
		p = entrada.nextFloat();
		
		if(p>50){
		e = (p-50);
			System.out.println("PESO TOTAL = "+p);
			System.out.println("EXCEDENTE = "+e);
			System.out.println("MULTA = "+(e*4));
			
		}else{
			System.out.println("PESO TOTAL = "+p);
			System.out.println("EXCEDENTE = 0");
			System.out.println("MULTA = 0");
		}
	}

}