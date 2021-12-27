import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount, index;
        double average = 0;
        int[] gradesAmount;

        NumberFormat formattter = NumberFormat.getInstance(new Locale("pt", "BR"));
        formattter.setMinimumFractionDigits(1);
        formattter.setMaximumFractionDigits(1);

        amount = input.nextInt();

        gradesAmount = new int[amount];

        for(index = 0; index < gradesAmount.length; index++) {
            gradesAmount[index] = input.nextInt();
            average+= gradesAmount[index];
        }

        average/= amount;

        System.out.println("media = " + formattter.format(average));
        for(index = 0; index < gradesAmount.length; index++) {
            System.out.println("nota " + (index+1) + " = " + formattter.format(gradesAmount[index]));
        }
    }
}
