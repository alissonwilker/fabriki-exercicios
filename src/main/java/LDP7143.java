import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);

		int primeiro = t.nextInt();
		int segundo = t.nextInt();
		int terceiro = t.nextInt();
		int quarto = t.nextInt();
		if(terceiro * terceiro >= 1000){
			System.out.println("c = "+terceiro*terceiro);
		}else{
			System.out.println("a = "+primeiro*primeiro);
			System.out.println("b = " +segundo * segundo);
			System.out.println("c = "+terceiro*terceiro);
			System.out.println("d = "+quarto * quarto);
		}
		
		

	}

}
