import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
		 int num, produto, num2;
		 
		 num = sc.nextInt();
		 
		 if (num==0) {
			 System.out.println("1");
		 }
		 
		 else if (num>0 && num<26) {
			 produto=num;
			 int a = num-1;
			 while(a>0) {
				num = num*a;
				a--;}}
		
		 System.out.println(num);
	}
}
