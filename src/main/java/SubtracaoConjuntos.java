import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * Receba como entrada dois conjuntos de valores de inteiros (A e B) e 
 * apresente a subtração entre eles (A - B).
 *  A entrada dos elementos de cada conjunto termina com o dígito 0 (zero).
 *   No exemplo abaixo, o conjunto A = {1, 2, 3} e o conjunto B = {2}.
 *  O resultado de A - B = {1, 3}. 
 */
		Scanner teclado = new Scanner(System.in);
		int [] A = new int[100]; //A[0] <= tamanho do conjunto A
		int [] B = new int[100]; //B[0] <= tamanho do conjunto B
		//Armazenar elementos inteiros no conjunto A, até receber 0;
		int entrada;

		int n=0;
		 do {
			n++;
			entrada = teclado.nextInt();
			A[n] = entrada;
		} while(entrada!=0);
		A[0] = n;
		
		//Armazenar elementos inteiros no conjunto B, até receber 0;
		n=0;

		do {
			n++;
			entrada = teclado.nextInt();
			B[n] = entrada;			
		} while(entrada!=0);
		B[0] = n;
		
		//Subtracao de conjuntos A-B
		for(int i=1; i<=B[0];i++) {
			for(int j=1; j<=A[0]; j++) {
				if((A[j] == B[i])) {
					// diminui tamanho de B e remove elemento em A[j] do conjunto A;
					A[j]=0;
					A[0]-=1;
				}
			}
		}
		
//		for(int i=0; i<100; i++) System.out.print(" "+ A[i]); System.out.println();
//		for(int i=0; i<100; i++) System.out.print(" "+ B[i]); System.out.println();
		
		for(int i=1; i<100; i++) {
			int j=0;
			if(A[i]!=0) { 
				System.out.println(A[i]);
				j++;
			}
			if(j==A[0]) break;
		}
	}

}
