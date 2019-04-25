import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Integer> ConjA = new ArrayList();// lista de inteiros de tamanho indefinido
		List<Integer> ConjB = new ArrayList();

		int num = entrada.nextInt(); //entrada para o conjunto A
		ConjA.add(num); //Adicionando entrada do conjunto A
		//Loop com condição de entrada para o conjunto A só para quando digitar zero
		while (num != 0) {
			num = entrada.nextInt();
			if (num != 0) { //condição para adicionar numeros na lista A.
				ConjA.add(num);
			}
		}

		for (int i = 0; i < ConjA.size() - 1; i++) { // laço de repetição para captar numeros da lista B
			num = entrada.nextInt();
			if (num != 0) {
				ConjB.add(num);
			} else {
				break;
			}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Integer> ConjA = new ArrayList();// lista de inteiros de tamanho indefinido
		List<Integer> ConjB = new ArrayList();

		int num = entrada.nextInt(); //entrada para o conjunto A
		ConjA.add(num); //Adicionando entrada do conjunto A
		//Loop com condição de entrada para o conjunto A só para quando digitar zero
		while (num != 0) {
			num = entrada.nextInt();
			if (num != 0) { //condição para adicionar numeros na lista A.
				ConjA.add(num);
			}
		}

		for (int i = 0; i < ConjA.size() - 1; i++) { // laço de repetição para captar numeros da lista B
			num = entrada.nextInt();
			if (num != 0) {
				ConjB.add(num);
			} else {
				break;
			}
