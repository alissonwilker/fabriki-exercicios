import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {


int[] nums = new int[5]; 
	nums[0] = 9;
	nums[1] = 10;
	nums[2] = 5;
	nums[3] = 6;
	nums[4] = 7;

	int media = 0;
	for(int i = 0; i<nums.length; i++) {
		
		media += nums[i];
	}

	float total = (float) media / nums.length;
	
	System.out.println("A média é: " +total);
	
	
	
	
	}
