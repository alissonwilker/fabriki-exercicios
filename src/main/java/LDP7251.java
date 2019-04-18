import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, m, maior = 0;
		
		
		
		/*
		 * 10
			5
			6
			7
			8
			0
		 */
		n = s.nextInt();
		
		laco: while(n != 0) 
		{
			m = s.nextInt();
			
			if(n ==0 | m==0) 
			{
				break laco;
			}
			
			if(n>m) 
			{
				maior = n;
			}
			else 
			{
				maior = m;
			}
			
		}
		
		System.out.println("maior = " + maior);
				
	}

}
