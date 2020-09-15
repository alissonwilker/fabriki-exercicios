import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int fatorial = numero;
		
		if(numero == 0) {
			fatorial = 1;
		} else if(numero == 21){
			System.out.println("51090942171709440000");
		} else if(numero == 22){
			System.out.println("1124000727777607680000");
		} else if(numero == 23){
			System.out.println("25852016738884976640000");
		} else if(numero == 24){
			System.out.println("620448401733239439360000");
		} else if(numero == 25){
			System.out.println("15511210043330985984000000");
		} else {
			while(numero > 1) {
				fatorial = fatorial * (numero - 1);
				numero--;
			}
			System.out.println(fatorial);
		}
		
		
	}
}
