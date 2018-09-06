
import java.util.Scanner;

public class LDP7142 {
    
    public static void main(String[] args) {
        
        int salario = 0;
        int salarioExcedente = 0;
        int salarioTotal = 0;
        
        Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();
        int horas = entrada.nextInt();
                        
        if (horas <= 50){
        
            salarioTotal = horas * 10;
            salarioExcedente = 0;
                                              
        }
        
        if (horas > 50){
                    
            salarioExcedente = (horas - 50) * 20;
            salarioTotal = salarioExcedente + 500;
        
        } 
                        
            System.out.println("codigo = " + codigo);
            System.out.println("salarioExcedente = " + salarioExcedente);
            System.out.println("salarioTotal = " + salarioTotal);
            
    }
    }
    
