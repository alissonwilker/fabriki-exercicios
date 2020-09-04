public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//int i;
		
		int Nota1 = scanner.nextInt();
		int Nota2 = scanner.nextInt();
		double media  =  (double) Nota1+Nota2/2;
		
				
		//for(i = 0; i > 0; i++){
		//}
		 
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		System.out.println("Media  = " + formatador.format(media));
		System.out.println("Nota1 = " + formatador.format(Nota1));
			
		

	}

}
