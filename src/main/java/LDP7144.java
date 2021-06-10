import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String resposta = "";
		String n1 = entrada.nextLine();
		int numero1 = Integer.parseInt(n1);
		if(numero1 != 0) {
			
			if(numero1 % 2 == 0) {
				resposta += "PAR";
			}else {
				resposta += "ÍMPAR";
			}
			
			if(numero1 > 0) {
				resposta += " E POSITIVO";
			}
			if(numero1 < 0) {
				resposta += " E NEGATIVO";
			}
			
		} else {
			resposta = "";
		}
		
		System.out.println(resposta);
		
	}
}
