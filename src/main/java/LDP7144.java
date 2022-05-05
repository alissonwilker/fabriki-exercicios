import java.util.Scanner;
public class LDP7144 {
	 public static void main(String[] args) {
		    Scanner entrada = new Scanner (System.in);
		    int num1 = entrada.nextInt();
		    
		    if ((num1 % 2 == 0) && (num1 >= 0)) {
		    	System.out.println("PAR E POSITIVO");
		    } else if ((num1 % 2 == 0) && (num1 < 0)) {
		        System.out.println("PAR E NEGATIVO");
		    } else if ((num1 % 2 != 0) && (num1 > 0)) {
		        System.out.println("ÍMPAR E POSITIVO");
		    }else {
		    	System.out.println ("ÍMPAR E NEGATIVO");
		    }
	 }
}
