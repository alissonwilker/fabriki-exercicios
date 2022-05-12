public class LDP7141 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			int a = entrada.nextInt();
			entrada.close();
		if( a > 50) {
			System.out.println("excedente = " + (a - 50));
			System.out.println("multa = " + (a - 50)* 4 );
		}
		else {
			System.out.println("excedente = " + 0 );
			System.out.println("multa = " + 0 );
		}
	}
	
}
