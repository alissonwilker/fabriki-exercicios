
public class LDP7144 {

	public static void main(String[] args)
	{
		String s1;
		String s2;
        int x = -15;
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
