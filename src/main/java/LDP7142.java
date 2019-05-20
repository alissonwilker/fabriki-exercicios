import java.util.Scanner;
public class LDP7142 {
	public static void main(String[] args) {
		String codigo;
		int salarioExcedente=0,salarioTotal=0,aux=0;
		Scanner leia=new Scanner(System.in);
		
		codigo=leia.next();
		aux=leia.nextInt();
		
		if(aux<=50) {
			salarioTotal=aux*10;
		}else{
			salarioTotal=(50*10)+((aux-50)*20);
			salarioExcedente=(salarioTotal-500);
		}
		
		System.out.println("codigo = "+codigo);
		System.out.println("salarioExcedente = "+salarioExcedente );
		System.out.println("salarioTotal = "+salarioTotal);
	}
}
