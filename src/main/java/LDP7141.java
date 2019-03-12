import java.util.Scanner;

public class LDP7141 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peso = Integer.parseInt(input.nextLine());
        int excesso = peso - 50;
        if(excesso > 0) {                
            int multa = excesso * 4 ;
            System.out.println("excedente = " +excesso);
            System.out.println("multa = "+multa);
        } else {   
            System.out.println("excedente = " +excesso);
            System.out.println("multa = 0");
        }
    }    
}
