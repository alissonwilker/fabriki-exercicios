import java.util.*;
public class SubtracaoConjuntos {
	public static void main(String[] args) {
		int rec,ac;
		Scanner input= new Scanner(System.in);
		ArrayList <Integer> A = new ArrayList();
		ArrayList <Integer> B = new ArrayList();
		rec= input.nextInt();
		while(rec!=0) {
			A.add(rec);
			rec=input.nextInt();
			
			
		}
	
			while(rec==0) {
				rec=input.nextInt();
			
			B.add(rec);
			
			}
			A.removeAll(B);
		for(int i=0;i<2;i++) {
		System.out.println(A.get(i));
		}
	}
}
