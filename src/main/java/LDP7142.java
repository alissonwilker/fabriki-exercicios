public class LDP7142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		System.out.println("Código: ");
		int cod = t.nextInt();
		
		System.out.println("Horas : ");
		int horas = t.nextInt();
		int extra = 0;
		if(horas > 50){
			extra = ((horas - 50) * 20);
		}
		int total = ((horas * 10) + extra)-200;
		System.out.println("Código = "+cod);
		System.out.println("SalarioExcedente = "+extra);
		System.out.println("SalarioTotal = "+total);
	}

}
