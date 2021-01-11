import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO INSERIR CÓDIGO AQUI
		int peixes_pescados, excesso_de_peso, valor_da_multa;
		
		System.out.printf("Informe a quantidade em quilos de peixes pescados:");
		peixes_pescados = entrada.nextInt();
		
		if (peixes_pescados >= 50){
			excesso_de_peso = peixes_pescados - 50;
			System.out.printf("excedente: %d", excesso_de_peso);
			
			valor_da_multa = excesso_de_peso * 4;
			System.out.printf("multa: %d", valor_da_multa);
		}else {
			excesso_de_peso = 0;
			valor_da_multa = 0;
		}
	}

}
