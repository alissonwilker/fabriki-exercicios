import java.io.PrintStream;
import java.util.Scanner;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO INSERIR CÓDIGO AQUI
		int peixes_pescados, excesso_de_peso = 0, valor_da_multa = 0;
		
		peixes_pescados = entrada.nextInt();
		
		if (peixes_pescados > 50){
			excesso_de_peso = peixes_pescados - 50;
			valor_da_multa = excesso_de_peso * 4;
		}
			System.out.println("excedente = "+ excesso_de_peso);
			System.out.println("multa = "+ valor_da_multa);
	}

}
