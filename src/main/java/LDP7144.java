
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
                System.out.println("ímpar e positivo");
            }else{
                System.out.println("par e negativo");
            }
        }else{
            if (num>0) {
                 System.out.println("ímpar e positivo");
            }else{
                System.out.println("ímpar e negativo");
            }
           
        }
    }
}
