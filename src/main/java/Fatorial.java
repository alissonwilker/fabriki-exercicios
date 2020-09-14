public class Fatorial {

	public static void main(String[] args) {
		
		int fat=1;
		
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		if (n >=0 || n <=25) {
		for(int i = 1; i<= n; i++) {
			fat = fat * i;
		}
		}
		System.out.println(fat);
		
	}

}
