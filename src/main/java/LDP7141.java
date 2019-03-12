import java.util.Scanner;

public class LDP7141 {
	public static void main(String[]args){
		int peso, excesso, multa;
		
		// System.out.println("Digite o peso (KG) do total da pescaria:");
		Scanner ent1=new Scanner(System.in);
		peso = ent1.nextInt();
		
		excesso = peso - 50;
		multa = excesso * 4;
		
		if (excesso > 1) {
			System.out.println("excedente = "+excesso);
			System.out.println("multa = "+multa);
		}
		else {	
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}
	}
}
