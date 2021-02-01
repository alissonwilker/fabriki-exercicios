import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int outro = entrada.nextInt();
		int maior = outro;
				
		while (outro !=0) {
			outro = entrada.nextInt();
			
			if (( maior < outro ) && ( outro !=0 )) {
				maior = outro;
			}
		}
		System.out.println("maior = " + maior );
		
	}
}
