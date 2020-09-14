public class LDP7142 {

	public static void main(String[] args) {
		
		
		int cod; 
		int numHrTrab;
		int exced;
		int sal;
		int e;
		int saltotal;
		
		Scanner scanner = new Scanner(System.in);
		cod =  scanner.nextInt();
		numHrTrab =  scanner.nextInt();
		
		if (numHrTrab>50) {
			
			e=numHrTrab-50;
			exced=e*20;
			sal=50 *10;
			saltotal = sal+exced;
		
			System.out.println("codigo = "+cod);
			System.out.println("salarioExcedente = "+exced);
			System.out.println("salarioTotal = "+saltotal);
			
		}
			else { 
				exced=0;
				saltotal=numHrTrab*10;
			
			
			System.out.println("codigo = "+cod);
			System.out.println("salarioExcedente = "+exced);
			System.out.println("salarioTotal = "+saltotal);
		
		}

	}
}
