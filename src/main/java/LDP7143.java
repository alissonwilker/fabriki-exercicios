import java.util.Scanner;

public class LDP7143 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        
        if(c*c>=1000){
            System.out.println("c2 = "+(c*c));
        }else{ 
        
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("c = "+c);
            System.out.println("d = "+d);
            System.out.println("a2 = "+(a*a));
            System.out.println("b2 = "+(b*b));
            System.out.println("c2 = "+(c*c));
            System.out.println("d2 = "+(d*d));
        }    

    }
    
}
