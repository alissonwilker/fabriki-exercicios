import java.util.ArrayList;
import java.util.Scanner;

public class LDP7251{

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> userValues = new ArrayList<Integer>();

        while (scnr.hasNextInt()) {
            int temp = scnr.nextInt();
            if (temp == 0) {
                break;
            } else {
                userValues.add(temp);
            }
        }
        int max = userValues.get(0);
        for (int i = 0; i < userValues.size(); i++) {
            if (max < userValues.get(i)) {
                max = userValues.get(i);
            }
        }

        System.out.println("maior = " + max);
    }
}
