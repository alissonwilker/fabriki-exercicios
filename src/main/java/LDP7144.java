import java.util.Scanner;

public class LDP7144 {
public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
		int numint = entrada.nextInt();
		
	
		if (numint % 2 == 0 && numint>=0  ) {
			System.out.println("PAR E POSITIVO");
			
		}else if (numint % 2 == 0 && numint<0  ) {
				System.out.println("PAR E NEGATIVO");
				
		}else if (numint % 3 == 0 && numint>=0  ) {
					System.out.println("ÍMPAR E POSITIVO");
		
		
		}else if(numint % 3 == 0 && numint<0) {
			System.out.println("ÍMPAR E NEGATIVO");
			
		}
		
}
}
    	

      
