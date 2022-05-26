import java.util.Scanner;

class LDP7251{
    public static void main(String[] args){
        int max = -100, n;
        Scanner entrada = new Scanner(System.in);
        
        do{
          n = entrada.nextInt();
          if(n!=0 &&  n>max){
              max = n;
          }
          else if(n == 0 && max == -100 ){
                max = 0;
          }
        }while(n!=0);
        System.out.println("maior = " + max);
    }
}
