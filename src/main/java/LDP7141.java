import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int peixes_pescados, excesso_de_peso, valor_da_multa;
		
		peixes_pescados = entrada.nextInt();
		
		if (peixes_pescados > 50){
			excesso_de_peso = peixes_pescados - 50;
			System.out.printf("excedente: %d", excesso_de_peso);
			
			valor_da_multa = excesso_de_peso * 4;
			System.out.printf("multa: %d", valor_da_multa);
		}else {
			excesso_de_peso = 0;
			System.out.printf("excedente: %d", excesso_de_peso);
			
			valor_da_multa = 0;
			System.out.printf("multa: %d", valor_da_multa);
		}
	}

}
