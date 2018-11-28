public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0, d = 0, somaa = 0, somab = 0, somac = 0, somad = 0;

		Scanner entrada = new Scanner(System.in);
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		
		somaa = a*a;
		somab = b*b;
		somac = c*c;
		somad = d*d;
	
		if(somac >= 1000){
		
		System.out.println("c2 = " + somac);
		
		}else{
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			
			System.out.println("a2 = " + somaa);
			System.out.println("b2 = " + somab);
			System.out.println("c2 = " + somac);
			System.out.println("d2 = " + somad);
		}

	}

}
