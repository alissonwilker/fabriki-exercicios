import java.util.Scanner;

public class Fatorial {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n,  fator = 1;
		
		n = s.nextInt();
		
		
		// n*(n - 1)*(n - 2)*(n - 3)*(n - ... a)
		
		for(int i = 2; i <= n ; i++) 
		{
			fator = fator*i;
		}
		
		System.out.println(fator);
		
		
		
	}

}
