import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicacaoMatrizes {
	
	public static ArrayList<ArrayList<Integer>> ArrayListA = new ArrayList<>();
	public static ArrayList<ArrayList<Integer>> ArrayListB = new ArrayList<>();
	
	private static Scanner entrada = new Scanner(System.in);
	static int LinhasA,ColunasA,ColunasB;
	static int LinhasA() {
		LinhasA = entrada.nextInt();
		return LinhasA;
	}
	static int ColunasA() {
		ColunasA = entrada.nextInt();
		return ColunasA;
	}
	static int ColunasB() {
		ColunasB = entrada.nextInt();
		return ColunasB;
	}
		
	public static ArrayList<Integer> A_Injector(int Colunas) {
		ArrayList<Integer> Injection = new ArrayList<Integer>();
		for(int j = 0; j < Colunas; j++) {
			int num = entrada.nextInt();
			Injection.add(num);
		}
		return Injection;
	}
	
	public static void main(String[] args) {
		LinhasA();
		ColunasA();
		ColunasB();
		int[][] C = new int[LinhasA][ColunasB];
		
		for(int i = 0; i < LinhasA; i++) {
			ArrayListA.add(i, A_Injector(ColunasA));
		}
		
		for(int i = 0; i < ColunasA; i++) {
			ArrayListB.add(i, A_Injector(ColunasB));
		}

		for(int i = 0; i < LinhasA; i++) {
			for(int j = 0; j < ColunasB; j++) {
				for(int k = 0; k < 2; k++) {
					C[i][j] += ArrayListA.get(i).get(k) * ArrayListB.get(k).get(j);
				}
			}
		}
		for(int i = 0; i < ArrayListA.size(); i++) {
			for(int j = 0; j < ColunasB; j++) {
				System.out.println(C[i][j]);
			}
		}
	}
}
