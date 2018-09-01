public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int pesoPeixe = entrada.nextInt();
		int excedentePeso = 0;
		int multaExcedente = 0;
		if (pesoPeixe > 50){
			excedentePeso = pesoPeixe - 50; 
			multaExcedente = excedentePeso * 4;
		}
		saida.println("excedente = " + excedentePeso +"\nmulta = " + multaExcedente);
	}
}