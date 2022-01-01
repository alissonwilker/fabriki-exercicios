
public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
	int media= 0;
	int soma = 0;
	int contNota = 0;
	
	int nota = entrada.nextInt();
	
	while (nota > 0 && nota <= 10) { 
		 
		 soma = soma + nota;
		 contNota = contNota +1;
		 
		 nota = entrada.nextInt();  
		 
	 	} 
		
		if (contNota > 0) {
			media = soma / contNota;
			 
			//System.out.println("media = "+ media); 
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

			formatador.setMinimumFractionDigits(1);

			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " + formatador.format(media));
			 
			//System.out.println("Nota "+contNota+" = "+ nota);
			System.out.println("nota = " + formatador.format(nota));
			
		}else {
			//System.out.println("Valores de NOTAS inválidos");
			nota = entrada.nextInt();
			
		}
	
	}
}
