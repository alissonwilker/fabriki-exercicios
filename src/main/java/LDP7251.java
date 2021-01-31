import java.util.Scanner;

public class LDP7251 {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, maior =-999999999;
		
		do {
			numero = entrada.nextInt();
			
			if (numero >= maior) {
			maior = numero;
			}
			
						
		}while(numero!=0);
		
		System.out.println("maior = " +maior);
	

}
}
