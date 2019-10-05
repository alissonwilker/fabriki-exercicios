import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um algoritmo que receba como entrada dois conjuntos de valores 
//de inteiros (A e B) e apresente a subtração entre eles (A - B). 
//A entrada dos elementos de cada conjunto termina com o dígito 0 (zero).
//No exemplo abaixo, o conjunto A = {1, 2, 3} e o conjunto B = {2}.
//O resultado de A - B = {1, 3}. Observação: é obrigatório que o tamanho 
//do conjunto B seja menor do que o tamanho do conjunto A.

public class SubtracaoConjuntos {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
List<Integer> listaA = new ArrayList<>();
List<Integer> listaB = new ArrayList<>();
		
		
		Integer A = entrada.nextInt();
		while(A != 0) {
			listaA.add(A);
			A = entrada.nextInt();
		}
		Integer B = entrada.nextInt();
		while(B != 0) {
			listaB.add(B);
			B = entrada.nextInt();
		}
		 
		listaA.removeAll(listaB);
		//System.out.println(lista);
		//System.out.println(lista.size());
		
		for (int i = 0; i < listaA.size(); i++) {
			System.out.println(listaA.get(i));
		}
		
	
	}
	
}
