import java.util.Scanner;
        
public class LDP7142 {

    
    public static void main (String [] args) { 
    int salariohtr = 10;
    int salariohext = 20;
    int salarioExcedente, salarioTotal;
    int horasext;
    
    Scanner ent = new Scanner(System.in);
    int codigo = ent.nextInt();
    
    Scanner in = new Scanner(System.in);
    int horastrb = in.nextInt();
    
    if (horastrb<=50) {
        salarioExcedente = 0;
        salarioTotal = horastrb*salariohtr;
        
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+salarioExcedente);
        System.out.println("salarioTotal = "+salarioTotal);
    } if (horastrb>50){
        salarioExcedente = (horastrb - 50)* salariohext;
        salarioTotal = 50*salariohtr + salarioExcedente;
        
        System.out.println("codigo = "+codigo);
        System.out.println("salarioExcedente = "+salarioExcedente);
        System.out.println("salarioTotal = "+salarioTotal);
    }
}
}
