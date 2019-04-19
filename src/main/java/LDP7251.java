import java.util.Scanner;
public class LDP7251{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n, m;
		n = s.nextInt();
		m = n;
		while (n != 0) { 
			if(n == 0 | m == 0) {
				break;}
		if (n > m) {
			m = n;}
		else  {
			 m = m;}
		n = s.nextInt();
		}
		System.out.println("maior = "+ m);}
}
