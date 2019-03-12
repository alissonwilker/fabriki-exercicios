import java.util.*;
public class LDP7141 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int kg=0,excesso=0,multa=0;
	
		kg= input.nextInt();
		if(kg>50) {
			excesso= (kg-50);
			multa= excesso*4;
			System.out.println("excedente= "+excesso);
System.out.println("multa= "+multa);
			
		} else{
System.out.println("excedente= " + excesso);
System.out.println("multa= "+ multa);
}
	}
}
