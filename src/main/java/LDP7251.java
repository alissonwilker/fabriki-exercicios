import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, m, maior = 0;
		
		n = s.nextInt();
				
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
			
			n = s.nextInt();
			
			
		}
		
		System.out.println("maior = " + maior);
				
	}

}
