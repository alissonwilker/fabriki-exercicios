import java.util.Scanner;
public class LDP7251 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n,n2, m =0;
		n = s.nextInt();
		while (n != 0) { m = n;
			if(n == 0 | m == 0) {
				break;}
			n2 = s.nextInt();	
		if (n2 > m) {
			m = n2;}
		else  {
			 m = n;}
//		n = s.nextInt();
		}
		System.out.println("maior = "+ m);}
}
