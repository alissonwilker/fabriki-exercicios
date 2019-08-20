import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float peso = Float.parseFloat(input.nextLine());
	     float excesso = peso - 50;
	     if(excesso > 0) {                
	    	 float multa = excesso * 4 ;
	    	 System.out.printf("Excedente", excesso , "Multa", multa);
	     } 
	     else {
	        System.out.printf("Não houve excesso.");
	        }
	    }    
}
