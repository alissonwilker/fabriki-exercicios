import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> conjuntoA = new ArrayList<>();
        List<Integer> conjuntoB = new ArrayList<>();
        int count = 0;
        int n;

        do {
            n = scanner.nextInt();
            if (n == 0)
                break;
            conjuntoA.add(n);
            count++;
        }while (true);

        count = 0;
        do {
            n = scanner.nextInt();
            if (n == 0)
                break;
            conjuntoB.add(n);
            count++;
        }while (true);

        conjuntoA.removeAll(conjuntoB);

        for (int i = 0; i < conjuntoA.size(); i++){
            System.out.println(conjuntoA.get(i));
        }
    }
}
