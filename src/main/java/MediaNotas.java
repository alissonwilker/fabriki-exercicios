public class MediaNotas {

	public static void main(String[] args) {
		int n = 0, contador = 0;
		double numero = 0, Soma = 0;
		System.out.print("Quantos números você deseja digitar?");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while (n <= 0) {
		    System.out.println("’" + n + "’ não é um número maior que ZERO.\n\n Quantos números você deseja digitar?:");
		    n = s.nextInt();
		}
		System.out.print("\n Agora pense nos " + n + " números que deseja.\n");
		if (n%2==0){
		for (contador = 1; contador <= n; contador = contador + 1) {
		    System.out.println("Digite o " + contador +"º número:");
		        numero = s.nextDouble();
		        if (contador > n / 2) {
		            Soma = Soma + numero;
		        }
		    }
		    Soma = Soma / (n / 2);
		    System.out.println("\nA média da segunda metade dos números digitados é: " +Soma);
	    } else {
		for (contador = 1; contador <= n; contador = contador + 1) {
		    System.out.println("Digite o " + contador +"º número:");
		        numero = s.nextDouble();
		        if (contador > ((n-1) / 2)) {
		            Soma = Soma + numero;
		        }
		    }
		    Soma = Soma / (((n-1) / 2) + 1);
		    System.out.println("\nA média da segunda metade dos números digitados e: " +Soma);
	    }
		        System.out.println("\n\n Fim do programa");
	}
	}
