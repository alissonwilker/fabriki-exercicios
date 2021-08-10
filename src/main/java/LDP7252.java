public class LDP7252 {
	public static void main(String[] args) {
	double [] xadrez= new double[64];
	xadrez[0]=1;
	for (int i=1;i<64;i++) {
		xadrez[i]=((xadrez[i-1])*2);
	}	
	double total = 0;
	 for(int i=0;i<64;i++) {
        total += xadrez[i];
        }
	 String tot = String.valueOf(total);
     System.out.println("totalGraos = " + tot);
}
}
