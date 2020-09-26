import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> conjA = new ArrayList<Integer>();
		List<Integer> conjB = new ArrayList<Integer>();
		int numA, numB;
		
		numA = sc.nextInt();
		conjA.add(numA);
		while(numA!=0) {
			numA = sc.nextInt();
			conjA.add(numA);
		
		}
		
		numB = sc.nextInt();
		conjB.add(numB);
		while(numB!=0) {
			numB = sc.nextInt();
			conjB.add(numB);
		}
		
		conjA.removeAll(conjB);
		
		for(int x=0;x<conjA.size();x++)
		System.out.println(conjA.get(x));
		
		
	}
}
