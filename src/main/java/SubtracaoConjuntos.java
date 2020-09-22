import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public SubtracaoConjuntos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> Adup = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int elemento = 3;
		while (elemento !=0) {
			elemento = scanner.nextInt();
			A.add(elemento);	
		}
		elemento =3;
		while (elemento !=0) {
			elemento = scanner.nextInt();
			B.add(elemento);				
		}
		byte unique = 1;
		for (int i = 0; i < A.size(); i++) {
			unique =1;
			for (int j = 0; j < B.size(); j++) {
				if (A.get(i)==B.get(j)){
					unique = 0;
				}
						
			}
			if (unique==1) {
				Adup.add(A.get(i));
			}
		}
		
		for (int j = 0; j < Adup.size(); j++) {
			System.out.println(Adup.get(j));
		}
		
		
	}

}
