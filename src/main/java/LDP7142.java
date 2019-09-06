import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	public static Scanner entrada = new Scanner(System.in);
	public static PrintStream saida = System.out; 
	
	
	public static void main(String[] args) {
		
		int codigo = entrada.nextInt();
		int hora = entrada.nextInt();
		int salarioExcedente = 0, salarioTotal = 0,horaExtra;
		
		if(hora <= 50) {
			
			salarioTotal = hora * 10;
			
			saida.println("codigo = "+codigo);
			saida.println("salarioExcedente = "+salarioExcedente);
			saida.println("salarioTotal = "+salarioTotal);
		}
		else {
			horaExtra= hora - 50;
			salarioExcedente = horaExtra * 20;
			salarioTotal = (50*10)+(horaExtra*20);
			
			saida.println("codigo = "+codigo);
			saida.println("salarioExcedente = "+salarioExcedente);
			saida.println("salarioTotal = "+salarioTotal);
		}
		
		
		
		
		
	}

}
