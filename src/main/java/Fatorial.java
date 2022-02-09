import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x, fat = 1; 
		
		x = sc.nextInt();
		sc.close();
	
		for (int i = 1;i <= x; i++)
		{fat = fat * i;} 
	 
		System.out.println(fat);
		
	}} 
