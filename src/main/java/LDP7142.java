import java.util.Scanner;

/**
 *
 * @author vasco
 */
public class LDP7142 {
    
    public static void main(String[] args) {
        
        int codigo = 0;
        int horas = 0;
        int horaextra = 0;
        int salario = 0;
        int salarioExcedente = 0;
        int salarioTotal = 0;
        
        System.out.println("Digite o código: ");
        Scanner entrada = new Scanner(System.in);
        codigo = entrada.nextInt();
        
        System.out.println("Digite o número de horas trabalhadas: ");
        Scanner entrada2 = new Scanner(System.in);
        horas = entrada2.nextInt();
                        
        if (horas <= 50){
        
            salarioTotal = horas * 10;
            salarioExcedente = 0;
                                              
        }
        
        if (horas > 50){
                    
            salarioExcedente = (horas - 50) * 20;
            salarioTotal = salarioExcedente + 500;
        
        } 
                        
            System.out.println("código = " + codigo);
            System.out.println("salarioExcedente = " + salarioExcedente);
            System.out.println("salarioTotal = " + salarioTotal);
            
    }
    }