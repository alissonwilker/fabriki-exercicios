public class LDP7252 {
	
		public static void main(String[] args) {

			BigInteger g = BigInteger.valueOf (1);
			BigInteger tg = BigInteger.valueOf (0);
			
			for (int cont = 1; cont <= 64; cont ++) {
				tg = tg.add (g);
				g = g.multiply (BigInteger.valueOf (2));
			}
			System.out.print("totalGraos = " + tg);
		}
	}
