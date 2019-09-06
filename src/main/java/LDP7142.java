import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142Java {
    
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
    public static void main(String[] args) {
        
        int cod = entrada.nextInt();
        int h = entrada.nextInt();
        int ex = 0;
        int salrioexcedente =0;
        int salarioTotal= 0; 
        
        if(h <=50) {
            salarioTotal = h*10;
            
        }else {
            ex =h -50;
            salrioexcedente = ex *20; 
            salarioTotal = salrioexcedente +500;
          
    }
        String codigo;
       saida.println("codigo = " +cod);
       saida.println("salrioexcedente = " +salrioexcedente);
       saida.println("salarioTotal = " +salarioTotal);
        
}

}
