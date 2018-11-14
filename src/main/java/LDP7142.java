import java.util.Scanner;

public class LDP7142{

  
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
        int codigo = 0;
        int hTrab = 0;
        int hEx= 0;
        int salarioN= 0;
        int salarioEx = 0;
        int salarioT= 0;
        
        codigo = sc.nextInt();
        hTrab = sc.nextInt();
      
      
      if(hTrab > 50){
    	  hEx = hTrab - 50;
          hTrab = 50;   
      }
      
        salarioN = hTrab * 10;
        salarioEx = hEx * 20;
        salarioT = salarioEx + salarioN;
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+(salarioEx));
        System.out.println("salarioTotal = "+(salarioT));
    
    }
    
}
