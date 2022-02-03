import java.util.Scanner;

public class SubtracaoConjuntos {
	public static void main(String[] args) {
		int cont=0;
		int contB=0;
		int[] valoresA = new int[100];
		Scanner sc = new Scanner (System.in);
		laco1:while(true) {
			cont += 1;
			//System.out.println("Lista A");
			//System.out.println("Digite o " + cont + "° número");
			valoresA[cont] = sc.nextInt();
			if (valoresA[cont] == 0) {
				cont = 0;
				break laco1;
			}
			else {
				contB += 1;
				continue;
			}
		}
		contB = contB - 1;
		int[] valoresB = new int[(contB)];
		for(cont=0; cont < valoresB.length; cont++) {
			//System.out.println("Lista B");
			//System.out.println("Digite o " + cont + "° número");
			
			valoresB[cont] = sc.nextInt();			
			if (valoresB[cont] == 0)  {
				cont = valoresB.length;
			}
			else {
				continue;
			}
		}
		int[] valoresC = new int[(100)];
		int contC = 0;
		for (int i = 0; i < valoresA.length; i++) {
			for (int j = 0; j < valoresB.length; j++) {
				if (valoresA[i] == valoresB[j]) {
					valoresC[i] = valoresA[i]; 
				}
			}
		}
		
		for (int k = 0; k < valoresC.length; k++) {
			if (valoresC[k] != 0) {
				System.out.println(valoresC[k]);
			}
		}

		}

}
