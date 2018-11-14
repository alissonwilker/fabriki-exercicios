public class LDP7141 {

	public static void main(String[] args) {
		int peso;
		int multa;
		int excedente;
		
		peso = 0;
		excedente = 0;
		multa = 0;
		
		if(peso>50){
			excedente=peso-50;
			multa=excedente*4;
		}
		System.out.println("excedente = " +excedente);
		System.out.println("multa = 0" +multa);

	}

}
