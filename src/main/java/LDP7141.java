import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada= new Scanner(System.in);
	private static PrintStream saida= System.out;

	public static void main(String[] args) {
		int c=0;
		int valor=entrada.nextInt();
	  

			if(valor>50) {
				valor-=50;
				c=valor*4;
				System.out.println("excedente = "+valor+ "\nmulta = "+c);
				
				
			}else {
				System.out.println("excedente = 0 "+"\nmulta = "+c);	
			}
	}

}
