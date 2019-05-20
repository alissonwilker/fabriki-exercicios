import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		int ht, exced=0, cod, total;
		//System.out.println("Digite o total de horas trabalhadas");
		cod =S.nextInt();
		ht =S.nextInt();
		
		if(ht>50) {
			exced = (ht-50)*20;
			total = exced+50*10;
			
		}else
		{
			total =ht*10;
		}
		
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+ exced);
		System.out.println("salarioTotal = "+ total);
		

	}

}
