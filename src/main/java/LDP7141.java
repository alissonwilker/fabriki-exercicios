import java.util.Scanner;

public class LDP7141 {
    
    public static void main(String[] args) {
        
        int peso = 0;
        int excedente = 0;
        int multa = 0;
        
        Scanner entrada = new Scanner(System.in);
                
        peso = entrada.nextInt();
        
        excedente = peso - 50;
        multa = excedente * 4;
           
        if (excedente >= 0){
            System.out.println("excedente = " + excedente);
            System.out.println("multa = " + multa);               
        }
        else {
            System.out.println("excedente = 0");
            System.out.println("multa = 0"); 
        }
   
}
}