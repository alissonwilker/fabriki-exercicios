public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int fatorial = numero;
		
		if(numero == 0) {
			fatorial = 1;
		} else {
			while(numero > 1) {
				fatorial = fatorial * (numero - 1);
				numero--;
			}
		}
		System.out.println(fatorial);
		
	}
}
