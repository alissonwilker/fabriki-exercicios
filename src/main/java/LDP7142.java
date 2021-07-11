import java.util.Scanner;


public class LDP7142 {

    public static void main(String[] args) {
        Scanner Sc  = new Scanner(System.in);
        int codigo = Sc.nextInt();
        int horasTrabalhadas = Sc.nextInt();
        int salarioTotal, salarioExcedente, rest;
        Sc.close();
        if(horasTrabalhadas > 50){
            salarioExcedente = horasTrabalhadas - 50;
            salarioExcedente = salarioExcedente * 20;
            horasTrabalhadas = 50 * 10;
            salarioTotal = horasTrabalhadas + salarioExcedente;
            System.out.println("codigo = "+ codigo);
            System.out.println("salarioExcedente = "+salarioExcedente);
            System.out.println("salarioTotal = "+salarioTotal);
            
        }else{
            salarioTotal = horasTrabalhadas * 10;
            salarioExcedente = 0;
            System.out.println("codigo = "+ codigo);
            System.out.println("salarioExcedente = "+salarioExcedente);
            System.out.println("salarioTotal = "+salarioTotal);
        }
        
    }
    
}
