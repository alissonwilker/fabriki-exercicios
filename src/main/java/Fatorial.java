import java.util.Scanner;
public class Fatorial
{
	public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;
        //if 1 < num <25 
        do{
            num = ent.nextInt();
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            System.out.println(fat);
            cont++;
       }while(cont < 2);
    }
}
