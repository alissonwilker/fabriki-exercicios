import java.util.Scanner;


public class LDP7142 {

  
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
        int cod = 0;
        int horasTrab = 0;
        int horasEx= 0;
        int salarioN= 0;
        int salarioEx = 0;
        int salarioT= 0;
        
      cod = sc.nextInt();
      horasTrab = sc.nextInt();
      
      
      if(horasTrab > 50){
          horasEx = horasTrab - 50;
          horasTrab = 50;   
      }
      
        salarioN = horasTrab * 10;
        salarioEx = horasEx * 20;
        salarioT = salarioEx + salarioN;
        System.out.println("codigo = "+cod);
        System.out.println("salarioExcedente = "+(salarioEx));
        System.out.println("salarioTotal = "+(salarioT));
    
    }
    
}
