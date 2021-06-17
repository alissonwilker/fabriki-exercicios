public class LDP7143 {

	private static Scanner in;

	public static void main(String[] args)
	{
		int a,b,c,d;
		int a2,b2,c2,d2;
		in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		a2 = (int) Math.pow(a, 2);
		b2 = (int) Math.pow(b, 2);
		c2 = (int) Math.pow(c, 2);
		d2 = (int) Math.pow(d, 2);
		
		if(c2 >= 1000) {
			System.out.println(c2);
		}else {
			System.out.println(a2);
			System.out.println(b2);
			System.out.println(c2);
			System.out.println(d2);
		}
	}
}
