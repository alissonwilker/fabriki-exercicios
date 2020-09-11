import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;


	public class LDP7251  {

		public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			int valor[] = new int[5];
			int maior = 0, menor = 0; 
			
			for(int i = 0; i < valor.length; i++){
				System.out.print("Digite o " +(i+1)+"º valor: ");
				valor[i] = sc.nextInt();
				if(valor[i] > maior){ 
					maior = valor[i];
				}
			}
			for (int j = 0; j < valor.length; j++) {
				if(valor[j] < menor){
					menor = valor[j];
				}
			}
			System.out.println("maior = "+ maior);
			//System.out.println("Menor valor = "+ menor);
		
		}
	}
