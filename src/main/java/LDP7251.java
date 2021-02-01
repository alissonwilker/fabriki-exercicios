import java.util.Scanner;

public class LDP7251 { //Exercício que busca o maior valor de um conjunto 01/02/21
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);				
		int novo = entrada.nextInt();
		int maior = novo;
		
		while (novo !=0) {
			novo = entrada.nextInt();
			
			if ((maior<novo)&&(novo!=0)) {
				maior = novo;
			}		
		}
	  System.out.println("maior = "+maior);		
				  
	  entrada.close();
  }
}
