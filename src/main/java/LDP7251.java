import java.util.Scanner;
public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		int maior = 0;
		do {
			System.out.print("");
			 i = entrada.nextInt();
			 if(i > maior){
				 maior = i;
			 } if(i < maior) {
				 maior = i;
			 }
		} while(i != 0); {
			 System.out.println("maior"+ " = "+ maior);
		}

	}
	
}
