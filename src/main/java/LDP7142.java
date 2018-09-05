import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		int cod = t.nextInt();
		int horas = t.nextInt();
		int extra = 0;
		if(horas > 50){
		  extra = (horas - 50) * 20;
		}
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+extra);
		System.out.println("salarioTotal = "+((horas*10)+extra));
	}

}
