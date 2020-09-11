import java.util.ArrayList;
import java.util.Scanner;

public class LDP7251 { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
	     int valor = scan.nextInt();
	     int maior = valor;
         
         while (valor != 0) {
        	 valor = scan.nextInt();         
           		if (valor > maior) {
     	 		valor = maior;
         }   
	 }        	 
            System.out.println("maior = " + maior);
}
}
