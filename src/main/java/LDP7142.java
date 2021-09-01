import java.util.Scanner;

public class LDP7142 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int CodFunc = entrada.nextInt();
        int HorasTrab = entrada.nextInt();
        entrada.close();
        int salarioExcedente = 0;
        int salarioTotal = 0;

        if (HorasTrab > 50){
            salarioExcedente = (HorasTrab - 50) * 20;
            salarioTotal = 50 * 10 + salarioExcedente;
        }
        else {
            salarioTotal = HorasTrab * 10;
        }
        System.out.println("codigo = " + CodFunc);
        System.out.println("salarioExcedente = " + salarioExcedente);
        System.out.println("salarioTotal = " + salarioTotal);
    }
}
