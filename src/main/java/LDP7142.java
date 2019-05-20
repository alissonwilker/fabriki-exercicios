import java.util.Scanner;
public class LDP7142 {
    public static void main(String[] args) {
        int codigo,tempo,salario;
        Scanner leia = new Scanner(System.in);
        codigo=leia.nextInt();
        tempo=leia.nextInt();
            if (tempo>50){
                System.out.println("codigo = "+codigo);
                salario =(tempo-50)*20;
                System.out.println("salarioExcedente = "+salario);
                System.out.println("salarioTotal = "+(salario+500));}
            else{
                System.out.println("codigo = "+codigo);
                System.out.println("salarioExcedente = 0");
                System.out.println("salarioTotal = "+tempo*10);                        }
                    
                    
            
        
    }
    
}
