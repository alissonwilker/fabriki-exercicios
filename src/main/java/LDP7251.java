import java.util.Scanner;

/* LDP7251 - Maior do Conjunto
 * 
 * Faça um algoritmo que determine o maior entre N números. A condição de parada é a entrada de um valor 0, ou seja, o algoritmo deve ficar calculando
 * o maior até que a entrada seja igual a 0 (ZERO).
 * 
 * Observe o espaço antes e depois do símbolo de igualdade (' = ') e também o caractere de fim de linha ao final de cada saída.
 *    
 *  */

public class LDP7251 {

	public static void main(String[] args) {
// variaveis globais ou de classe		
			int num = 1;
			int maior = -99999;
							
			while(num != 0) {
								
				Scanner entrada = new Scanner(System.in);
				num = entrada.nextInt();
				
				if(num != 0 & num > maior) {
					
					maior = num;
				
				entrada.close();	
					
				}
				
				
			}
			
			System.out.println("maior = " + maior);
			
}
	
}