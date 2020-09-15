import java.math.BigDecimal;
import java.util.Scanner;

public class Fatorial {

    
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
        
BigDecimal fatorial = new BigDecimal(1);
if(n<=25){
for ( int i = n; i > 0; --i ) {
   fatorial = fatorial.multiply(new BigDecimal(i));
}

System.out.println(fatorial);
}
}
}
