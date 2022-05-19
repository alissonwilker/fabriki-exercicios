import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma1, soma2; 
		int cod = ler.nextInt();
		 int hrs = ler.nextInt();
		 ler.close();
		 
		 if(hrs <= 50) {
			 System.out.println("codigo = " +cod);
			 System.out.println("salarioExcedente = 0");
			 System.out.println("salarioTotal = " + hrs*10);
		 
		 }else {
			 soma2 = (hrs-50)*20;
			 soma1 = 50*10;
			 System.out.println("codigo = " +cod);
			 System.out.println("salarioExcedente = " + soma2);
			 System.out.println("salarioTotal = "+ (soma1+soma2));
			 
		 }

	}

}
