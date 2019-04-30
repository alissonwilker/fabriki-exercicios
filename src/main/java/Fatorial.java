public class Fatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		
        Scanner entrada= new Scanner(System.in);
        int num = entrada.nextInt();
	    for (int i = 1;i < 26 ; i ++ ) {
	      fatorial *= i;

	      System.out.println("Fatorial de " +i+"=" +fatorial);
	    }
	  }
	
	}
