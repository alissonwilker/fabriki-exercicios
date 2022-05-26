import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		int max = 0, n;
		  Scanner entrada = new Scanner(System.in);
		  
	   do{
		    n = entrada.nextInt();
		    
		   if(n > max) {
			    max = n;
		   }
		}while (n!=0);
	   System.out.println("maior = " + max);
	}
}
	
