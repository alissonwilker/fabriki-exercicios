import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada =new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,tipo=0,valor=0;

		x = entrada.nextInt();
		
		if(x%2==0) {
			tipo = 1;
		}
		
		if(x>0){
			
			valor = 1;	
		}
	
		if(tipo==1 && valor==1) {
		
		saida.println("PAR E POSITIVO");
		}
		if(tipo==0 && valor==1) {
			
		saida.println("ÍMPAR E POSITIVO");
		}
		if(tipo==1 && valor==0) {
			
		saida.println("PAR E NEGATIVO");
		}
		if(tipo==0 && valor==0) {
			
		saida.println("ÍMPAR E NEGATIVO");
		}
		
		
	}

}