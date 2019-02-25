public class Calculadora {

	public int soma(int x, int y) {
		return x + y;
	}
	public int subtracao(int x, int y) {
		return x - y;
	}

	public int multiplicacao(int x, int y) {
		return x * y ;
	}
	public double divisao(int x, int y) {
		if (x != 0 && y != 0  ) {
			
			return x / y;
		}else {
			throw new IllegalArgumentException();
		}
			
	}
	public double raizQuadrada(double x) {
		return Math.sqrt(x);
	}

	public double potencia(double x, double y) {
		return Math.pow(x, y);
		
	}
}
