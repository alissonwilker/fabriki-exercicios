import java.util.Scanner;


class Fatorial {
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, fat=1;

        n = scanner.nextInt();
        
   		if(n>=0){
          for (int i = 1; i <= n; i++){
                fat = fat * i;
            }
            System.out.println(fat);
       }
   }
}
