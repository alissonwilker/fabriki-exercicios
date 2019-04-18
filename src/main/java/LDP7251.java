import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, m, maior = 0;
		
		n = s.nextInt();
		
		/*
		 * 10
			5
			6
			7
			8
			0
		 */
		
		
		while(n != 0) 
		{
			m = s.nextInt();
			
			if(n>m) 
			{
				maior = n;
				
			}
			
			else if(m>n)
			{
				maior = m;
			}
			
			if(m == 0) 
			{
				break;
			}
			
			n = s.nextInt();
			
			
		}
		
		System.out.println("maior = " + maior);
				
	}

}
