import java.util.Scanner;
public class Fatorial{
	public static void main(String[] args) {
	Scanner valores = new Scanner(System.in);
	int num = valores.nextInt();
	valores.close();
	if (num==0) {
		num=1;}
	else {
	 for (int i=num-1; i>=1; i--) { 
       num = num*i;
    }  } 
    System.out.println (num);    
}
}
