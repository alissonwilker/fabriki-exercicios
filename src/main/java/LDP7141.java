import java.util.Scanner;
public class LDP7141 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    int peso;
            peso=leia.nextInt();
        if (peso>50){
            System.out.println("Peso exedente:"+(peso-50)+" Kg");
            System.out.println("Valor da multa:R$ "+((peso-50)*4));}
        else{
            System.out.println("Peso exedente:0 Kg");
            System.out.println("Valor da multa:0 R$");
        }        
    }
}
