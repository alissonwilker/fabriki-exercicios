public class LDP7141 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			int peso = entrada.nextInt();
			entrada.close();
		if( peso > 50) {
			System.out.println("excedente = " + (peso-50));
			System.out.println("multa = " + (peso-50)*4);
		}
		else {
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}
	}
	
}
