package exercicios;

import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args)
	{
		String s1;
		String s2;
		Scanner in;
		in = new Scanner(System.in);
		
        int x;
        x = in.nextInt();
        if(x % 2 == 0) {
        	s1 = "PAR";
        }else {
        	s1 = "ÍMPAR";
        }
        
        if(x > 0) {
        	s2 = "POSITIVO";
        } else {
        	s2 = "NEGATIVO";
        }

        
        System.out.println(s1 +" E " + s2);
	}
}
