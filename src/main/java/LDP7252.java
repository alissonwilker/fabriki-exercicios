import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LDP7252 {
	
	//	private static double primeiro, segundo;

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			BigInteger graosCasa = BigInteger.ONE;
			BigInteger graos = BigInteger.ONE;
			double casasTabuleiro = 64;
			//double graosCasa=1,casasTabuleiro=64; 
			//long graos=1;
			
			for(double x=1;x<casasTabuleiro;x++){
				//graosCasa = graosCasa*2;
				//graos +=graosCasa;
				graosCasa = graosCasa.multiply(new BigInteger("2"));
				graos = graos.add(graosCasa);


			}

			System.out.println("totalGraos = "+graos);

		}
		}
