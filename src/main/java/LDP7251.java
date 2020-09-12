import java.util.Scanner;

public class LDP7251 {

		    public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int valor = 1, maior;
		   
		    valor = scan.nextInt();
		    maior = valor;
		        while(valor != 0){
		            valor = scan.nextInt();
		            if(valor > maior && valor != 0) maior = valor;
		        }
		    System.out.println("maior = " + maior);
	 }
}
