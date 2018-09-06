import java.util.Scanner;


public class LDP7142 {

  
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
        int codigo = 0;
        int horasTrabalhadas = 0;
        int horasExtras= 0;
        int salarioNormal= 0;
        int salarioExtra = 0;
        int salarioTotal= 0;
        
      codigo = sc.nextInt();
      horasTrabalhadas = sc.nextInt();
      
      
      if(horasTrabalhadas > 50){
          horasExtras = horasTrabalhadas - 50;
          horasTrabalhadas = 50;   
      }
      
        salarioNormal = horasTrabalhadas * 10;
        salarioExtra = horasExtra * 20;
        salarioTotal = salarioExtra + salarioNormal;
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+(salarioExtra));
        System.out.println("salarioTotal = "+(salarioTotal));
    
    }
    
}
