import java.util.Scanner;


public class LDP7143{
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; int b; int c; int d;
        int a2; int b2; int c2; int d2;

        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        a2 = a*a;
        b2 = b*b;
        c2 = c*c;
        d2 = d*d;

        if(c2>=1000){
            System.out.println("c2 = "+c2);
        }else{
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("c = "+c);
            System.out.println("d = "+d);
            System.out.println("a2 = "+a2);
            System.out.println("b2 = "+b2);
            System.out.println("c2 = "+c2);
            System.out.println("d2 = "+d2);
        }    
    }
}
