
public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		
		//int Nota1 = 2;
		//int Nota2 = 1;
		
		int Nota1 = scanner.nextInt();
		//System.out.println("Digite Nota 1  = " + Nota1);
		int Nota2 = scanner.nextInt();
		//System.out.println("Digite Nota 2  = " + Nota2);
		double media  =  (double) Nota1+Nota2/2;
		
		int i;
				
		for(i = 0; i > 0; i++){
		}
		 
			//Scanner ent = new Scanner(System.in);
	       // int nota1, nota2;
	        //int media, i, contAluno = 0;
	        
	        //for(i = 0; i > 0; i++){
	            
	          //  contAluno++;
	            // recebe a 1º nota
	            //System.out.println("Digite nota 1 " + contAluno );
	            //nota1 = ent.nextInt();
		
		
		//int nota1 = scanner.nextInt();
		//int nota2 = scanner.nextInt();		
		//double media = (double)notas / qtde;
	    // for (int qtde > 0; qtde ++) {
		 //  for (int j = 0; j < colunasA; j++) {
		//int media = notas / qtde;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		formatador.setMinimumFractionDigits(1);

		formatador.setMaximumFractionDigits(1);

		System.out.println("Media  = " + formatador.format(media));
		System.out.println("Nota1 = " + formatador.format(Nota1));
		
		
		

	}

}
