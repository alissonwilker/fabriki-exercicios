public class Calculadora {

	/**
	 * Retorna o valor da soma entre dois números inteiros.
	 * 
	 * @param x O primeiro valor a ser somado.
	 * @param y O segundo valor a ser somado.
	 * @return A soma entre os dois valores.
	 */
	public int soma(int x, int y) {
		return x+y;
	}

	/**
	 * Retorna o valor da subtração entre dois números inteiros.
	 * 
	 * @param x O valor total.
	 * @param y O valor a ser subtraído do valor total.
	 * @return O resultado da subtração.
	 */
	public int subtracao(int x, int y) {
		return x-y;
	}

	/**
	 * Retorna o valor da multiplicação entre dois números inteiros.
	 * 
	 * @param x O primeiro valor a ser multiplicado.
	 * @param y O segundo valor a ser multiplicado.
	 * @return O resultado da multiplicação.
	 */
	public int multiplicacao(int x, int y) {
		return x*y;
	}

	/**
	 * Retorna o valor da divisão de X por Y, dois números inteiros.
	 * 
	 * @param x O valor do divisor.
	 * @param y O valor do dividendo.
	 * @return O resultado da divisão.
	 */
	public double divisao(int x, int y) {
		return x/y;
	}

	/**
	 * Retorna o valor da raiz quadrada de um número.
	 * 
	 * @param x O valor a ser calculada a raiz quadrada.
	 * @return O resultado do cálculo da raiz quadrada.
	 */
	public double raizQuadrada(double x) {
		return Math.sqrt(x);
	}

	/**
	 * Retorna o valor da potência de um número elevado a outro número (X elevado a Y).
	 * 
	 * @param x O valor da base.
	 * @param y O valor da potência.
	 * @return O resultado do cálculo da potência.
	 */
	public double potencia(double x, double y) {
		return Math.pow(x, y);
	}

}
