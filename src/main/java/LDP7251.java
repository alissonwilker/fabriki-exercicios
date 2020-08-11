import java.util.Scanner;

public class LDP7251 {

	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		int maior = 0;
		int num;
		
		do {
			System.out.print(": "); 
			num =  input.nextInt();
			if (num>maior) {
				
				maior=num;}
			
			if (num<0) {
				maior=num;}
			}
		
	
	
	    while((num >0 || num <0));
	    
	     	
	    	
	    
			
		System.out.print(" =" +maior);
		
	}
	
}
			
			
		
		
