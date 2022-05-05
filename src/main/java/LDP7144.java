import java.util.Scanner;

public class LDP7144 {
	
	    public static void main(String[] args) {
	 
	        int num;
	        int par=0;
	        int impar=0;
	        int pos=0;
	        int neg=0;
	       
	        System.out.println("Informe um número:");
	        Scanner num = new Scanner(System.in);
	        	int n = num.nextInt();
	        	
	        	if{
					if (n % 2 == 0) {
	    			par++;
	    			System.out.println(	"PAR E POSITIVO");
					}
					else {
	    			impar++;
	    			System.out.println("PAR E NEGATIVO");
				}
				else {
	    		if (n > 0) {
	    			pos++;
	    			System.out.println("ÍMPAR E POSITIVO");
	    		}
	    		else (n < 0) {
	    			neg++;
	    			System.out.println("ÍMPAR E NEGATIVO");
	    		}
				}
}
}
}
