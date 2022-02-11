package fim;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares;
		
		String negativoEpositivo, imparEpar;
		
		System.out.print("Digite um número: ");
		pares = sc.nextInt();
		
		if  (pares>= 0){
			 negativoEpositivo = "positivo";
		} else {
			 negativoEpositivo = "negativo";
		}
		int resto = pares % 2;
		
		if (resto == 0) {
			imparEpar = "par";
		} else {
			imparEpar = "impar";
		}
		
		System.out.println("o número "+ pares + " eh " + imparEpar + " e "+  negativoEpositivo );
		
			

}


				{

	}

			
	}

	



