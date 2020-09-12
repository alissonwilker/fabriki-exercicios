import java.util.Scanner;

public class LDP7251{ 
	
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int maior=num;

while(num !=0) {
  
	if (maior<num){  

	  maior=num;}
  num = scanner.nextInt();
  }
  System.out.println("maior=" + maior);
		}
		}
	
