import java.io.PrintStream;

public class LDP7252 {

private static PrintStream saida = System.out;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int g=1;

	for(int i=0; i<63;i++) {
	
		g=g+(g*2);
}
	saida.println("totalGraos = "+g);
	}

}
