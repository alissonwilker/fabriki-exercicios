import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        ArrayList<Integer> setA = new ArrayList<Integer>();
        ArrayList<Integer> setB = new ArrayList<Integer>();
        index = 1;
        while(index != 0) {
            int valueA = input.nextInt();
            if(valueA == 0) break;
            else setA.add(valueA);
        };

        index = 1;
        while(index != 0) {
            int valueB = input.nextInt();
            if(valueB == 0) break;
            else setB.add(valueB);
        };

        for(index = 0; index < setA.size(); index += 1) {
            if(setB.contains(setA.get(index))) {
                continue;
            } else System.out.println(setA.get(index));
        }
    }
}
