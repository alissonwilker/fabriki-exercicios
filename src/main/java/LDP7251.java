import java.util.Scanner;

public class LDP7251 {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, maior, cont =0;
		
		numero = entrada.nextInt();
		maior = numero;
		if (numero > 0) {
		do {
			numero = entrada.nextInt();
			if (cont > 0 && numero !=0) {
			maior = numero;
			}
			
			cont++;		
			
		}while(numero!=0);
		
		}
		
		System.out.println("maior = " +maior);
	

}
}
