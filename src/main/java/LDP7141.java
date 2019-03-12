import java.util.*;
public class LDP7141 {
	public static void main(String[] args){
		Scanner input= new Scanner (System.in);
		int kg,excesso=0,multa=0;
	
		kg= input.nextInt();
		if(kg>50) {
			excesso= kg-50;
			multa= excesso*4;
		}
		if(kg>50) {
			System.out.println("excedente= "+excesso);
System.out.println("multa= "+multa);
			
		}
	
	}
	}
