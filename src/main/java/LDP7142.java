import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
    public static void main(String[] args) {
        int codigo = Integer.parseInt(entrada.nextLine());
        int horasTrabalhadas = Integer.parseInt(entrada.nextLine());
        
        int salarioTotal = 0;
        int exc = 0;
        int salarioExcedente = 0;
        
        if (horasTrabalhadas > 50) {
            exc = horasTrabalhadas - 50;
            salarioExcedente = exc * 20;
            salarioTotal = (50 * 10) + salarioExcedente;
        }else {
            salarioTotal = horasTrabalhadas * 10;
        }
        
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+salarioExcedente);
        System.out.println("salarioTotal = "+salarioTotal);
    }
}
