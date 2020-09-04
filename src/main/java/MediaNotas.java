public class MediaNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtdeNotas = scanner.nextInt();
		int nota[] = new int [qtdeNotas];
		double soma = 0;
		
		//leitura das notas
		for (int i=0;i<qtdeNotas;i++) {
			nota[i] = scanner.nextInt();}
		
		//calculo da soma das notas
		for (int i=0;i<qtdeNotas;i++) {
			soma +=nota[i];}
			
		//calculo da soma da média
		double media = soma / qtdeNotas;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		System.out.println("media = " + formatador.format(media));}}
