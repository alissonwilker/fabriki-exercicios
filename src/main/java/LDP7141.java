import java.util.Scanner;

public class LDP7141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int excedente, multa, peso;
		peso = sc.nextInt();
		if (peso>50) {
			excedente = peso - 50;
			multa = excedente * 4;
		}
		else {
			excedente = 0;
			multa = 0;
		}
		System.out.println("excedente = " + excedente);
		System.out.println("multa = "+ multa);
		
		sc.close();
	}

}
