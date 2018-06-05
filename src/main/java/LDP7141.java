import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
private static Scanner entrada= new Scanner(System.in);
private static PrintStream saida=System.out;

public static void main(String[] args) {
	//TODO Auto-generate method stub
	int pesot=0;
	System.out.print("Digite o peso dos peixes q vc pescou");
	if(pesot>50&&pesot<=70) {
		System.out.print("execedente de $20 e $80 de multa");
		
	}else {
		System.out.println("Vc nao paga multa nenhuma");
	}
	
}
}