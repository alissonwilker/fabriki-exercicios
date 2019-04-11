public class MediaNotas.java {
	private static Scanner entrada = new Scanner(System.in);
	

	public static void main(String[] args) {
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);
		
		int [] notas;
		double media = 0;
		double soma = 0;
		int qtdnotas = entrada.nextInt();
		notas = new int[qtdnotas]; // declara/inicializa array
		
		for (int i = 0; i < qtdnotas; i++) {
			notas [i] = entrada.nextInt();
						
			soma = notas [i] + soma;
			media = soma/qtdnotas;
			
			for (int i = 0; i<= qtdnotas; i++) {
				System.out.println("media = " + formatador.format(media));
				System.out.println("nota = " + formatador.format(notas[i+1]));
			}
		} 
		
	}

}
