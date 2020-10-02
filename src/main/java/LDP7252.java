import java.util.Scanner;

public class LDP7252 {
	private static double primeiro;
	public static void main(String[] args) {
	
		try (Scanner entrada = new Scanner(System.in)) {
		}
	
	double graosCasa=1,casasTabuleiro=64;
	int graos=1;
	
	int x;
	int i=0;
	for(int n=1;x<casasTabuleiro;i++){
	graosCasa = graosCasa*2;
	graos +=graosCasa;
	}
	
	System.out.println("\nO quantidade de grãos é: "+graos);
	}
	public static double getPrimeiro() {
		return primeiro;
	}
	public static void setPrimeiro(double primeiro) {
		LDP7252.primeiro = primeiro;
	}
	}
