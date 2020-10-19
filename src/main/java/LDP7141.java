import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	//private static Scanner entrada = new Scanner (System.in);
		//	private static PrintStream saida = System.out;
				
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in); 
		        System.out.println("Digite o seu Peso:");

		        
		        float peso = Float.parseFloat(input.nextLine());

		        
		        float excesso = peso - 50;
		        if(excesso > 0) {                
		            float multa = excesso * 4 ;
	
		            System.out.printf("excedente=20", excesso + multa);
		          
		        
		    }    
}
	}
