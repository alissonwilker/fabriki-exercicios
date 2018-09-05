import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142{
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo = 0, horas = 0, salario = 0, salarioExcedente = 0, horasExcedente = 0, conta =0;
		
		codigo = entrada.nextInt();
		horas = entrada.nextInt();
		
		if(horas > 50){
			 horasExcedente = horas - 50;
			 conta = (50 * 10);
			 salarioExcedente = (horasExcedente * 20);
			 salario = salarioExcedente + conta;
		}
		else{
			salarioExcedente = 0;
			salario = (horas * 10);
		}
		
		System.out.println("Codigo: " + codigo);
		System.out.println("SalarioExcedente: " + salarioExcedente);
		System.out.println("Salario Total: " + salario);
		
	}

}
