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
	private List<Senha> filaNormal = new ArrayList<Senha>();
	private List<Senha> filaPrioridade = new ArrayList<Senha>();

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
            filaNormal.remove(PREFIXO_SENHA_NORMAL);
            filaPrioridade.remove(PREFIXO_SENHA_NORMAL);
	}

	/**
	 * Gera e adiciona no final da estrutura de dados correspondente uma nova senha
	 * de atendimento que pode ser prioritÃ¡ria se o valor de prioridade for
	 * <b>true</b>, ou nÃ£o prioritÃ¡ria se o valor de prioridade for <b>false</b>.
	 * 
	 * @param prioridade o parÃ¢metro que indica se a senha que serÃ¡ gerada Ã©
	 *                   prioritÃ¡ria ou nÃ£o.
	 * @return a senha gerada.
	 */
	public Senha gerarSenha(boolean prioridade) {
             this.filaNormal = new ArrayList<Senha>();
             Senha senha = null;
             this.filaNormal.add(senha);
             return filaNormal.get(0);
        }
	private Senha gerarSenhaPrioridade() {
		String senhaString = Totem.PREFIXO_SENHA_PRIORIDADE + (this.filaPrioridade.size() + 1);
		return new Senha(senhaString, true);
	}

	private Senha gerarSenhaNormal() {
		String senhaString = Totem.PREFIXO_SENHA_NORMAL + (this.filaNormal.size() + 1);
		return new Senha(senhaString, false);
	}

	/**
	 * Chama a prÃ³xima senha para atendimento. O critÃ©rio de ordem de chamada da
	 * senha se define por: enquanto a fila de prioridade tiver senhas ainda nÃ£o
	 * atendidas, a senha retornada serÃ¡ da fila de prioridade. Se a fila de
	 * prioridade nÃ£o tiver senhas ainda nÃ£o atendidas, ou seja, se estiver vazia, a
	 * senha retornada serÃ¡ da fila normal.
	 * 
	 * @return a senha que serÃ¡ atendida.
	 */
	public Senha chamarSenha() {
		if(filaPrioridade.size() != 0){
            return this.filaNormal.remove(0);  
          
        }
                return null;
        }

	/**
	 * Apenas verifica a prÃ³xima senha que serÃ¡ atendida.
	 * 
	 * @return a prÃ³xima senha que serÃ¡ atendida.
	 */
	public Senha verificarProximaSenha() {
	for (int i = 0; i < this.filaNormal.size(); i++) {
       
        }
        return filaNormal.get(0);
        }
	/**
	 * Retorna o tamanho da fila de prioridade.
	 * 
	 * @return o tamanho da fila de prioridade.
	 */
	public Integer getTamanhoFilaPrioridade() {
		return this.filaPrioridade.size();
	}

	/**
	 * Retorna o tamanho da fila normal.
	 * 
	 * @return o tamanho da fila normal.
	 */
	public Integer getTamanhoFilaNormal() {
		return this.filaNormal.size();
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
