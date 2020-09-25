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
			conjB.add(numA);
		}
		
		for (int x=0; x<conjB.size();x++) {
			for (int y=0; y<conjA.size(); y++) {
				if(conjB.get(x)==conjA.get(y)) {
					conjA.set(y, 0);
				}
			}
		}
		
		
		
		for (int z=0;z<conjA.size();z++) {
			if(conjA.get(z)!=0) {
			System.out.println(conjA.get(z));}
		}
	}
}
