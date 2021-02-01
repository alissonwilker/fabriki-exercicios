import java.util.Scanner;

public class LDP7251 { //Exercício que busca o maior valor de um conjunto 01/02/21
		
	public static void main(String[] args) { // como se faz a leitura de informações da entrada padrão
				
				Scanner entrada = new Scanner(System.in); //atalho para incluir é control shift O
						
				int saida = 0;
				int maior = 0;
			
				while (saida != 1) {
					int novo = entrada.nextInt();//int novo = entrada.nextInt();
					
					if (novo==0) {
						saida=1;
					}
					else if (novo>maior) {
						maior=novo;
					}			
			    }
				System.out.println("maior = "+maior);// digite sout depois control espaço e tudo isso já vai ser digitado automaticamente.
				maior--;
		}
	}
