package fim;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		String negativoEpositivo, imparEpar;
		num = sc.nextInt();
		
		if  (num >= 0){
			 negativoEpositivo = "positivo";
		} else {
			 negativoEpositivo = "negativo";
		}
		int resto = num % 2;
		
		if (resto == 0) {
			imparEpar = "par";
		} else {
			imparEpar = "impar";
		}
		System.out.println( imparEpar + " e "+  negativoEpositivo );
		
			

}


				{

	}

			
	}

	

