import java.util.Scanner;
public class Fatorial
{
	public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 1, fat = 1;
        int cont = 1;
        if ((0 <= num) || (num<=25)){
            num = ent.nextInt();
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            System.out.println(fat);
            cont++;
       }while(cont < 2);
    }
}
