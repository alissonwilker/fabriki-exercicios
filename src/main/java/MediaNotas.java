public class MediaNotas {

public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int qtd_notas;
		//int total_soma_notas = 0;
		double media = 0;
				
			 qtd_notas = entrada.nextInt();
									
				int notas[] = new int [qtd_notas];
				
				for (int i = 0; i < notas.length; i++) {
					notas[i]=entrada.nextInt();
					media+= notas[i];
				}
				
			
				NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

				formatador.setMinimumFractionDigits(1);

				formatador.setMaximumFractionDigits(1);
				System.out.println("media = " + formatador.format(media/notas.length));
				for (int i = 0; i < notas.length; i++) {
					System.out.println("nota "+(i+1)+" = "+formatador.format(notas[i]));
				}
				
			}
	}
