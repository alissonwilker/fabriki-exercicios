
import java.util.Scanner;
import java.io.PrintStream;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida=System.out;
	public static void main(String[] args) {
		
		int cod,ht;
		int saln,salex,saltotal;
		
		cod=Integer.parseInt(entrada.nextLine());
		
		ht=Integer.parseInt(entrada.nextLine());
				
			if(ht<=50){
			saln=ht*10;
			salex=0;
		}
			else{
			saln=500;
			salex=(ht-50)*20;
		}
		saltotal=saln + salex;
		saida.println("codigo = " + cod);
		saida.println("salarioExcedente = " + salex);
		saida.println("salário total = " + saltotal);
		}
}
