import java.util.Scanner;
public class LDP7142 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int codigo = 0;
       int ht = 0;
       int salarioht = 0;
       int salariohe = 0;
       int he = 0;
       
       //System.out.println("Digite seu código");
       codigo = s.nextInt();
       //System.out.println("Digite horas trabalhadas");
       ht = s.nextInt();
      
        
       if (ht > 50) { 
           he = ht - 50;
           salariohe = 20*he;
           salarioht = salariohe + 500;
        }else{
          salarioht = ht*10;
       }
        System.out.println("codigo = " + codigo);
        System.out.println("salarioExcedente = " + salariohe);
        System.out.println("salarioTotal = " + salarioht);
    }
    
}
