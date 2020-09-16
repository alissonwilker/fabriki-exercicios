public class Fatorial {

	public static void main(String[] args) {
 try (Scanner ent = new Scanner(System.in)) {
	int num = ent.nextInt();
		
	System.out.println("" +basicInterativefatorial(num));
	}
	}
	public static BigInteger basicInterativefatorial(int n){
		if(n == 0) return BigInteger.ONE;
	BigInteger aux = BigInteger.ONE;
		for (int i = 2; i <= n; i++){
		BigInteger indice = BigInteger.valueOf(i);
		aux = aux.multiply(indice); 
			
			 }
		  return aux;
			}
}
