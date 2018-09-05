public class LDP7142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		System.out.println("Código: ");
		int cod = t.nextInt();
		
		System.out.println("Horas : ");
		int horas = t.nextInt();
		int extra = 0;
		if(horas >= 50){
		  extra = (horas - 50) * 20;
		}
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+extra);
		System.out.println("salarioTotal = "+((50*10)+extra));
	}

}
