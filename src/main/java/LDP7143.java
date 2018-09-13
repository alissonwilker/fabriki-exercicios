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
			System.out.println("c2 = "+terceiro*terceiro);
		}else{
			System.out.println("a = "+primeiro);
			System.out.println("b = "+segundo);
			System.out.println("c = "+terceiro);
			System.out.println("d = "+quarto);
			System.out.println("a2 = "+primeiro*primeiro);
			System.out.println("b2 = " +segundo * segundo);
			System.out.println("c2 = "+terceiro*terceiro);
			System.out.println("d2 = "+quarto * quarto);
		}
		
		

	}

}
