import java.util.Scanner;

public class LDP7142 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int cod = entrada.nextInt();
        int horatrab = entrada.nextInt();
        int horaextra = (horatrab - 50); 
       
		int[] valorhora = new int[4];
		valorhora[0] = 10; 
		valorhora[1] = 20; 
		valorhora[2] = horatrab * valorhora[0];
		valorhora[3] = horaextra * valorhora[1];
		
		if(horatrab > 50){
			System.out.println("codigo = " + cod);
			System.out.println("salarioExcedente = " + valorhora[3]);
			System.out.println("salarioTotal = " + (500 + valorhora[3]));	
		}else {
			System.out.println("codigo = " + cod);
			System.out.println("salarioExcedente = 0");
			System.out.println("salarioTotal = " + valorhora[2]);	
		}
		
		}
	}
