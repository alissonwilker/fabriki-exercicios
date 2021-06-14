 import java.util.Scanner;

 public class LDP7144 {
        public static void main(String[] args) {
           
                Scanner lerNumeros = new Scanner(System.in);
                 int n1 = lerNumeros.nextInt();

                 if(n1 % 2 == 0 && n1 >= 0) {
                 System.out.printIn("PAR E POSITIVO");
                 } else if(n1 % 2 != 0 && n1 >= 0) {  
                 System.out.printIn("ÍMPAR E POSITIVO");
                 } else if(n1 % 2 == 0 && n1 < 0) { 
                 System.out.printIn("PAR E NEGATIVO");
                 } else if(n1 % 2 != 0 && n1 < 0) { 
                 System.out.printIn("ÍMPAR E POSITIVO");
                 }
       }
}
