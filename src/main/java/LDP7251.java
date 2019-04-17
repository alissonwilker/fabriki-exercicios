import java.util.Scanner; 

public class LDP7251 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, m, maior = 0;
		
		n = s.nextInt();
		
		while(n != 0) 
		{
			m = s.nextInt();
			
			if(m == 0)
			{
				break;
			}
						
			if(n>m) 
			{
				maior = n;
			}
			
			else 
			{
				maior = m;
			}
			
			
			
			n = s.nextInt();
			if(n>m) 
			{
				maior = n;
			}
		}
		
		System.out.println("maior = " + maior);
				
	}

}
