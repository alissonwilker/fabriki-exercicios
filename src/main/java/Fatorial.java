public class Fatorial {

	public static void main (String []args){
		
		for (int i = 1, fatorial = 1; i <= 25; i++) {			
			fatorial *= i;
			System.out.println("Fatorial de " + i + " é: " + fatorial);
		}
	}
}
