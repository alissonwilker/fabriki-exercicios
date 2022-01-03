import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite a nota 1: " );
			nota1 = entrada.nextDouble();
			
			System.out.println("Digite a nota 2: ");
			nota2 = entrada.nextDouble();
			
			System.out.println("Digite a nota 3: ");
			nota3 = entrada.nextDouble();
		}
		
		media = (nota1+nota2+nota3) /3;
		System.out.println("A média do aluno é:" + media);
		
		if(media>70) {
			System.out.println("Aprovado");
		}
		
		else if(media>50) {
			System.out.println("Recuperação");
		
		}

		else
		{
			System.out.println("Reprovado");
		}

	}

}

