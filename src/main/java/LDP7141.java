import java.util.Scanner;

public class LDP7141 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pesoEntrada = sc.nextInt();
        int excedente = 0;
        int multa = 0;

        if(pesoEntrada > 50) {
            excedente = (pesoEntrada - 50);
            multa = excedente * 4;
        }

        System.out.printf("excedente = %d\nmulta = %d\n", excedente, multa);
    }
}

        if(pesoEntrada > 50) {
            excedente = (pesoEntrada - 50);
            multa = excedente * 4;
        }

        System.out.printf("excedente = %d\nmulta = %d", excedente, multa);
    }
}
