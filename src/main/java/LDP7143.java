import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtnum = 4;
		int num[] = new int [qtnum];
		char alternativa[]= {'a','b','c','d'};
		for(int i=0;i<qtnum;i++) {
			num[i] = scanner.nextInt();
		}
		double validacao = Math.pow(num[2],2);
		if (validacao>=1000) {
			System.out.println(alternativa[2] +"2"+" = "+Math.round(Math.pow(num[2],2)));

		}else {
			for (int i=0;i<qtnum;i++){
			System.out.println(alternativa[i] + " = " + num[i]);}
			for(int i=0;i<qtnum;i++){
			System.out.println(alternativa[i] +"2"+" = "+Math.round(Math.pow(num[i],2)));}
		}
	}
}
