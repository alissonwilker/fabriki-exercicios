import java.util.Scanner;

public class LDP7251 { //Exercício que busca o maior valor de um conjunto 01/02/21
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
								
		int parada = 0;
		int maior = 0;
			
		while (parada != 1) {
			int novo = entrada.nextInt();
			switch (novo) {
			case 0: parada=1;
			default:
				if (novo>maior) {
					maior=novo;
				}
			}		
	  }
	  System.out.println("maior = "+ maior);
  }
}
