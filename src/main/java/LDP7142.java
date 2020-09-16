import java.util.Scanner;

public class LDP7142{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int h = scanner.nextInt();
        int sE = 0;
        int sT = 0;
        int salario = 0;
        
        if(h>50){
            salario = h * 10;
            for(int i = 50; i < h; i++){
                sE += 20;
                i++;
            }
            sT = salario + sE;
        }else{
            sT = h * 10;
        }


        System.out.println("codigo = " + c);
        System.out.println("salarioExcedente = " + sE * 2);
        System.out.println("salarioTotal = " +sT);

    }
}
