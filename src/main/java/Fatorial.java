public class Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int factor, factorial = 1; 
		factor = input.nextInt();
		
		for (int index = 1; index <= factor; index++) {
			factorial *= index;
		
		}
		;
	
		
		System.out.println(factorial);
	}

}
