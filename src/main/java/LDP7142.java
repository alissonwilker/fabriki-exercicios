import java.util.Scanner;
        
public class LDP7142 {

    
    public static void main (String [] args) { 
    int salarioExcedente, salarioTotal;
    int horastrb;
    
    Scanner ent = new Scanner(System.in);
    int codigo = ent.nextInt();
    horastrb = ent.nextInt();
  
    
    if (horastrb<=50) {
        
        salarioExcedente = 0;
        salarioTotal = horastrb*10;
        
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+(salarioExcedente));
        System.out.println("salarioTotal = "+(salarioTotal));
        
    } else{
        salarioExcedente = (horastrb - 50)* 20;
        salarioTotal = (50*10) + salarioExcedente;
        
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+(salarioExcedente));
        System.out.println("salarioTotal = "+(salarioTotal));
    }
}
}
