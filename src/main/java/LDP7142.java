
import java.util.Scanner;
import java.io.PrintStream;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida=System.out;
	public static void main(String[] args) {
		
		int cod,ht,het;
		int saln,salex,saltotal;
		
		cod=Integer.parseInt(entrada.nextLine());
		
		ht=Integer.parseInt(entrada.nextLine());
		het=2*ht;
		
			if(ht<=50){
			saln=ht*10;
			salex=0;
		}
			else{
			saln=500;
			salex=(ht-50)*20;
		}
		saltotal=saln + salex;
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+ salex);
		System.out.println("salário total = " + saltotal);
		}
}
