import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LDP7252 {
	

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			double graosCasa=1,casasTabuleiro=64;
			long graos=1;

			for(long x=1;x<casasTabuleiro;x++){
				graosCasa = graosCasa*2;
				graos +=graosCasa;
			}

			System.out.println("totalGraos =  "+graos);

		}
	}
