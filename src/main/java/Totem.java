import java.util.ArrayList;
import java.util.List;

public class Totem {

	/**
	 * Constante que indica o prefixo das senhas normais/nÃ£o prioritÃ¡rias.
	 */
	public static final String PREFIXO_SENHA_NORMAL = "N";

	/**
	 * Constante que indica o prefixo das senhas prioritÃ¡rias.
	 */
	public static final String PREFIXO_SENHA_PRIORIDADE = "P";

	private static Totem instance;
	private List<Senha> filaNormal;
	private List<Senha> filaPrioridade;

	private Totem() {
		this.filaNormal = new ArrayList<Senha>();
		this.filaPrioridade = new ArrayList<Senha>();
	}

	/**
	 * Retorna uma instÃ¢ncia Ãºnica de Totem.
	 * 
	 * @return uma instÃ¢ncia Ãºnica de Totem.
	 */
	public static Totem getInstance() {
		if (instance == null) {
			instance = new Totem();
		}

		return instance;
	}

	/**
	 * Reinicia o Totem, limpando/zerando todas as filas que ele gerencia.
	 */
	public void reiniciar() {
		filaNormal.clear();
		filaPrioridade.clear();

	}

	/**
	 * Gera e adiciona no final da estrutura de dados correspondente uma nova senha
	 * de atendimento que pode ser prioritÃ¡ria se o valor de prioridade for
	 * <b>true</b>, ou nÃ£o prioritÃ¡ria se o valor de prioridade for <b>false</b>.
	 * 
	 * @param prioridade
	 *            o parÃ¢metro que indica se a senha que serÃ¡ gerada Ã©
	 *            prioritÃ¡ria ou nÃ£o.
	 * @return a senha gerada.
	 */
	public Senha gerarSenha(boolean prioridade) {

		if (prioridade == true) {
			return gerarSenhaPrioridade();
		} else {
			return gerarSenhaNormal();
		}

	}

	private Senha gerarSenhaPrioridade() {
		String senhaString = Totem.PREFIXO_SENHA_PRIORIDADE + (this.filaPrioridade.size() + 1);
		filaPrioridade.add(new Senha(senhaString, true));
		return new Senha(senhaString, true);
	}

	private Senha gerarSenhaNormal() {
		String senhaString = Totem.PREFIXO_SENHA_NORMAL + (this.filaNormal.size() + 1);
		filaNormal.add(new Senha(senhaString, false));
		return new Senha(senhaString, false);
	}

	/**
	 * Chama a prÃ³xima senha para atendimento. O critÃ©rio de ordem de chamada da
	 * senha se define por: enquanto a fila de prioridade tiver senhas ainda nÃ£o
	 * atendidas, a senha retornada serÃ¡ da fila de prioridade. Se a fila de
	 * prioridade nÃ£o tiver senhas ainda nÃ£o atendidas, ou seja, se estiver vazia,
	 * a senha retornada serÃ¡ da fila normal.
	 * 
	 * @return a senha que serÃ¡ atendida.
	 */
	public Senha chamarSenha() {

		if (filaPrioridade.isEmpty() == false) {
			Senha s = filaPrioridade.get(0);
			filaPrioridade.remove(0);
			return s;
		}
		if (filaNormal.isEmpty() == false) {
			Senha s = filaNormal.get(0);
			filaNormal.remove(0);
			return s;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Apenas verifica a prÃ³xima senha que serÃ¡ atendida.
	 * 
	 * @return a prÃ³xima senha que serÃ¡ atendida.
	 */
	public Senha verificarProximaSenha() {

		if (!filaPrioridade.isEmpty()) {
			return filaPrioridade.get(1);
		} else {
			return filaNormal.get(1);
		}

	}

	/**
	 * Retorna o tamanho da fila de prioridade.
	 * 
	 * @return o tamanho da fila de prioridade.
	 */
	public Integer getTamanhoFilaPrioridade() {
		return filaPrioridade.size();
	}

	/**
	 * Retorna o tamanho da fila normal.
	 * 
	 * @return o tamanho da fila normal.
	 */
	public Integer getTamanhoFilaNormal() {
		return filaNormal.size();
	}

	public List<Senha> getFilaNormal() {
		return filaNormal;
	}

	public void setFilaNormal(List<Senha> filaNormal) {
		this.filaNormal = filaNormal;
	}

	public List<Senha> getFilaPrioridade() {
		return filaPrioridade;
	}

	public void setFilaPrioridade(List<Senha> filaPrioridade) {
		this.filaPrioridade = filaPrioridade;
	}

}
