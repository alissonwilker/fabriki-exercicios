public class LDP7252 {
	
		public static void main(String[] args) {

			BigInterger g = new BigInterger ("1");
			BigInterger tg = new BigInterger ("1");
			BigInterger cont = new BigInterger ("1");
			BigInterger m = new BigInterger ("2");

			for (cont = 2; cont <= 64; cont ++) {
			  g = g.multiply (m);
			tg = g.add (tg);
			}
			
			System.out.print("totalGraos =" + tg);
		}

	}
