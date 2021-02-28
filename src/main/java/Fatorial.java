import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, fat =1;
		Scanner entrada = new Scanner (System.in);
		numero = entrada.nextInt();
		if(numero >= 0 && numero <= 25) {
		for (fat = 1; numero > 1; numero = numero - 1 ) {
			fat = fat * numero;
		}System.out.println(fat);
		}
		}
		
		
	}
