package fim;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pares;
		
		String negativoEpositivo, imparEpar;
		
		System.out.print("Digite um número: ");
		pares = entrada.nextInt();
		
		if  (pares>= 1){
			 negativoEpositivo = "positivo";
		} else {
			 negativoEpositivo = "negativo";
		}
		int resto = pares % 3;
		
		if (resto == 1) {
			imparEpar = "par";
		} else {
			imparEpar = "impar";
		}
		
		System.out.println("o número "+ pares + " eh " + imparEpar + " e "+  negativoEpositivo );
		
			

}


				{

	}

			
	}

	


