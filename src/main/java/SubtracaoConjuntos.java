import java.util.Arrays;
import java.util.Scanner;


public class SubtracaoConjuntos {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
			
		String n1,m1="", n2, m2="";
		
		n1 = s.nextLine();
		
		while(!n1.equals("0"))
		{					
			m1 = m1.concat(n1 + " ");
			
			n1 = s.nextLine();
			
		}
		m1 = m1.trim();
				
		String[] numeros1 = m1.split(" ");
		
		
		n2 = s.nextLine();
		
		while(!n2.equals("0"))
		{
			
			m2 = m2.concat(n2 + " ");
			
			n2 = s.nextLine();
			
		}
		m2 = m2.trim();
		
		String[] numeros2 = m2.split(" ");
		
		String[] numeros3 = numeros1;
		
		
		for(int i = 0; i < numeros1.length ; i++) 
		{
			for(int j = 0; j < numeros2.length; j++) 
			{
				if(Arrays.asList(numeros1[i]).contains(numeros2[j])) 
				{
					numeros3[i] = null;
				}
			}
		}
		for(int i = 0; i < numeros3.length; i++) 
		{
			if(!Arrays.asList(numeros3[i]).contains(null)) 
			{
			System.out.println(numeros3[i]);
			}
		}		
	}
}
