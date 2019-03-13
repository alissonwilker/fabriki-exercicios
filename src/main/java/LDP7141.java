
public class LDP7141 { 
    
    public static void main(String[] args)
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite o seu Peso:");

        
        float peso = Float.parseFloat(input.nextLine());

        
        float excesso = peso - 70;
        if(excesso > 20) {                
            float multa = excesso * 80 ;
           
            System.out.printf("O valor que passou foi:%.2f KG%nO valor da multa é:%.2f Reais%n" , excesso , multa);
        } else {   //Não escreva condição para a negação 
            System.out.printf("Não houve excesso.");
        }
    }    
}
