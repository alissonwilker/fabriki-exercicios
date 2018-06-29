public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso = 0;
		int multa = 0;
		int excedente= 0;
		
		 System.out.println ("Digite o valor do peso: ");
		 peso = entrada.nextInt();
		 
			if (peso > 50){
				excedente = peso - 50;
				multa = excedente*4;
				
			}
		
			saida.println ("excedente =  "+excedente);
            System.out.println ("multa = "+multa);
      }

}