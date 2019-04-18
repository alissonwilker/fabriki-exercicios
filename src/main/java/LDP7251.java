import java.util.Iterator;
import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int maior=0;
		Scanner  S = new Scanner(System.in);
		
		while(num > 0) {
			//System.out.println("Digite um numero inteiro ou numero zero para sair");
			//for(int i=0; i<3; i++)
			//System.out.println("Digite um numero inteiro ou numero zero para sair");
		num = S.nextInt();
		if(num > maior) {
			num = maior;
			num++;
			System.out.println("o numero é maior"+num);
			
		}
		else if(num< maior) {
			System.out.println("O numero é menor"+num);
			
	}}

}}
