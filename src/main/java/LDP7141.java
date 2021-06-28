import java.util.Scanner;

public class LDP7141 {
    public static void main(String[] args) throws Exception {
        Scanner Entrada = new Scanner(System.in);
        int Peso = Entrada.nextInt();
        Entrada.close();
        int Exc = Peso - 50;
        int Mu = Exc * 4;

        if(Peso <= 50){
            System.out.println("excedente = 0");
            System.out.println("multa = 0");
        }
        else {
            System.out.println("excedente = " +Exc);
            System.out.println("multa = " +Mu);
        }
    }
}
