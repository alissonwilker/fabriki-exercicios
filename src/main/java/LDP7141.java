import java.util.Scanner;


public class LDP7141 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Qual é o valor do Peso?");

        
        
        int peso = Integer.parseInt(input.nextLine());

        
        int excesso = peso - 50;
        if(excesso > 0) {                
            int multa = excesso * 4 ;
            
             System.out.printf("Valor do Excedente é " + excesso + "KG" + " Valor da multa é " + multa + "R$");
        } else {   
            System.out.printf("Não houve excesso.");
        }
    }    
}