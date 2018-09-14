
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mayara
 */
public class LDP7144 {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        
        int num = t.nextInt();
        
        if ((num % 2) == 0) {
            if (num >0) {
                System.out.println("PAR E POSITVO");
            }else{
                System.out.println("PAR E NEGATIVO");
            }
        }else{
            if (num>0) {
                 System.out.println("ÍMPAR E POSITIVO");
            }else{
                System.out.println("ÍMPAR E NEGATIVO");
            }
           
        }
    }
}
