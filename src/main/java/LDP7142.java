
import java.util.Scanner;



public class LDP7142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		int cod = t.nextInt();
		int horas = t.nextInt();
		int extra = 0;
		int total = horas;
		if(horas > 50){
		  extra = (horas - 50) * 20;
                  
		}
                int num = horas -50;
		
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+extra);
                if(horas<=50){
                  System.out.println("salarioTotal = "+(horas*10));
                }else{
                   System.out.println("salarioTotal = "+((50*10)+(extra)));
 
                }
		
	}

}