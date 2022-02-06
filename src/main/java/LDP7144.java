public class LDP7144 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int valor = entrada.nextInt();
	
	if (valor % 2 == 0 && valor >= 0) {
		System.out.printLn("Par e positivo");
	} 
	else if (valor % 2 == 0 && valor <0) {
		System.out.printLn("Par e negativo");
	}
	
	}
	
}
