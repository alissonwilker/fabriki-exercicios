import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount, index;
        double average = 0;
        int[] gradesAmount;

        amount = input.nextInt();

//        System.out.println("Getting total amount of grades = " + amount);

        gradesAmount = new int[amount];

        for(index = 0; index < gradesAmount.length; index++) {
            gradesAmount[index] = input.nextInt();
            average+= gradesAmount[index];
        }

        average/= amount;

        System.out.println("media = " + numberFormat(average));
        for(index = 0; index < gradesAmount.length; index++) {
            System.out.println("nota " + (index+1) + " = " + numberFormat(gradesAmount[index]));
        }
    }
    public static String numberFormat(Number number) {
        NumberFormat formattter = NumberFormat.getInstance(new Locale("pt", "BR"));
        formattter.setMinimumFractionDigits(1);
        formattter.setMaximumFractionDigits(1);
        formattter.format(number);
        return formattter.format(number);
    }
}
