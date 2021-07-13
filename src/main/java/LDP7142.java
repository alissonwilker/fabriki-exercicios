import java.util.Scanner;
public class LDP7142 {
	public static void main(String[] args) {
					Scanner s = new Scanner( System. in );
				int codigo=s.nextInt();
				int horas=s.nextInt();
				s.close();
				if (horas>50){
					System.out.println("codigo = "+codigo);
					System.out.println("salarioExcedente = " +((horas-50)*20));
			System.out.println("salarioTotal = " +((50*10)+((horas-50)*20)));}
				if (horas<=50){
					System.out.println("codigo = "+codigo);
					System.out.println("salarioExcedente = 0" );
					System.out.println("salarioTotal = " +(horas*10));}
}	}
