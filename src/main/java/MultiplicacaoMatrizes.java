import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	
	public static ArrayList<ArrayList<Integer>> MatrizA = new ArrayList<>();
	public static ArrayList<ArrayList<Integer>> MatrizB = new ArrayList<>();
	public static ArrayList<ArrayList<Integer>> MatrizC = new ArrayList<>();
	
	private static Scanner entrada = new Scanner(System.in);
	static int LinhasA,LinhasB,ColunasA;
	static int LinhasA() {
		LinhasA = entrada.nextInt();//Números de linhas da Matriz A
		return LinhasA;
	}
	static int ColunasA() {
		ColunasA = entrada.nextInt();//Números de linhas da Matriz A
		return ColunasA;
	}
	static int LinhasB() {
		LinhasB = entrada.nextInt();//Números de linhas da Matriz B
		return LinhasB;
	}
		
	static ArrayList<Integer> A_Injector() {
		int[] array = new int[ColunasA];
		ArrayList<Integer> Injection = new ArrayList<Integer>(Arrays.asList(array));
		for(int j = 0; j < ColunasA; j++) {
			int num = entrada.nextInt();
			array[j] = num;
		}
		return Injection;
	}
	
	public static void main(String[] args) {
		//Primeiro crie as linhas e colunas das matrizes
		LinhasA();
		ColunasA();
		LinhasB();
		for(int i = 0; i < LinhasA; i++) {
			MatrizA.add(i, A_Injector());
		}
		System.out.println(MatrizA);
		
		//Por fim, faça a multiplicação entre as duas matrizes
	}
}
