import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		 int n = 1; 
		 int Maior = 0;
		 n = entrada.nextInt();
		 Maior = n;
		 
		 while (n != 0) {
			 n = entrada.nextInt();
			 
			 if((n > Maior)&&(n != 0)){
				 Maior = n;
			 }
		 }
		 entrada.close();
		 System.out.println("maior = "+Maior);
	}

}
