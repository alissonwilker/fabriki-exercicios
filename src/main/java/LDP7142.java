import java.io.PrintStream;
import java.util.Scanner;
public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod = entrada.nextInt();
		int salario = entrada.nextInt();
		int extra=0;
		int excedente=0;
		if (salario>50) {
			
			extra=salario-50;
			excedente=extra*20;
			
			salario=excedente+500;
			
		}else {
			
			excedente=extra*20;
			
			salario=salario*10;
		}
		
		
		saida.println("codigo = "+cod);
		saida.println("salarioExcedente = "+excedente);
		saida.println("salarioTotal = "+salario);
		
	}

}
