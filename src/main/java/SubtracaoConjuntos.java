import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> conjA = new HashSet<Integer>();
		HashSet<Integer> conjB = new HashSet<Integer>();
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
			conjB.add(numA);
		}
		
		conjA.removeAll(conjB);
		
		Iterator<Integer>itr = conjA.iterator();
		while(itr.hasNext()) {
			Integer element = itr.next();
			System.out.println(element);
		}
		
		
	}
}
