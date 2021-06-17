import java.util.Scanner;

public class LDP7143 {
	public static int calculaQuadrado(int numero) {
		int num = numero * numero;
		return num;
	}
	public static void main(String[] args) {
		
		Scanner lerNumeros = new Scanner(System.in);
		
		int n1 = lerNumeros.nextInt();
		int n2 = lerNumeros.nextInt();
		int n3 = lerNumeros.nextInt();
		int n4 = lerNumeros.nextInt();

		if(calculaQuadrado(n3) >= 1000) {
	        System.out.println("c2 = "+ calculaQuadrado(n3));
		} else {
			System.out.println("a = "+ n1);
			System.out.println("b = "+ n2);
			System.out.println("c = "+ n3);
			System.out.println("d = "+ n4);
			System.out.println("a2 = "+ calculaQuadrado(n1));
			System.out.println("b2 = "+ calculaQuadrado(n2));
			System.out.println("c2 = "+ calculaQuadrado(n3));
			System.out.println("d2 = "+ calculaQuadrado(n4));
		}
	}
}
