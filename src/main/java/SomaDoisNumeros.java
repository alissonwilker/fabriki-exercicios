import java.util.Scanner;
public class SomaDoisNumeros {
	 
	 public static void main(String[] args) {
		  
		    Scanner entrada = new Scanner(System.in);
		     
		    // usuario digita os dois valores digitados
		    System.out.println();
		    int n1 = Integer.parseInt(entrada.nextLine());
		    System.out.println();
		    int n2 = Integer.parseInt(entrada.nextLine());
		     
		    // soma dos números digitados
		    int resultado = somar(n1, n2);
		     
		    // resultdo da soma
		    System.out.println(resultado);
		  }
		  }
