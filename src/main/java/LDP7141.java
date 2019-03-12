import java.util.Scanner;
public class LDP7141 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    int peso;
            peso=leia.nextInt();
        if (peso>50){
            System.out.println("excedente ="+(peso-50));
            System.out.println("multa ="+((peso-50)*4));}
        else{
            System.out.println("excedente = "+peso*0);
            System.out.println("multa = "+ peso*0);
        }        
    }
}
