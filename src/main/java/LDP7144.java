import java.util.Scanner;

public class LDP7144.java{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();

                        if(numero % 2 == 0 && numero >=0){
                                 System.out.println("PAR E POSIVITO");
                                 }
			else{
				System.out.println("ÍMPAR E NEGATIVO");
			}
			if(numero<0){
				System.out.println("PAR E NEGATIVO");
			}else {
				System.out.println("ÍMPAR E POSITIVO"); 
}
}
}
