import java.util.ArrayList;
import java.util.List;

public class Totem {

	/**
	 * Constante que indica o prefixo das senhas normais/não prioritárias.
	 */
	public static final String PREFIXO_SENHA_NORMAL = "N";

	/**
	 * Constante que indica o prefixo das senhas prioritárias.
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
	 * Retorna uma instância única de Totem.
	 * 
	 * @return uma instância única de Totem.
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
            Totem instance1 = Totem.getInstance();
	}

	/**
	 * Gera e adiciona no final da estrutura de dados correspondente uma nova senha
	 * de atendimento que pode ser prioritária se o valor de prioridade for
	 * <b>true</b>, ou não prioritária se o valor de prioridade for <b>false</b>.
	 * 
	 * @param prioridade o parâmetro que indica se a senha que será gerada é
	 *                   prioritária ou não.
	 * @return a senha gerada.
	 */
	public Senha gerarSenha(boolean prioridade) {
		 if(!prioridade){
     Senha senha =this.gerarSenhaNormal();
     this.filaNormal.add(senha);
     return senha;
  }
   else {

     Senha senha = this.gerarSenhaPrioridade();
     this.filaPrioridade.add(senha);
     return senha ;
  }
	}

	private
                Senha gerarSenhaPrioridade() {
		String senhaString = Totem.PREFIXO_SENHA_PRIORIDADE + (this.filaPrioridade.size() + 1);
		return new Senha(senhaString, true);
	}

	private Senha gerarSenhaNormal() {
		String senhaString = Totem.PREFIXO_SENHA_NORMAL + (this.filaNormal.size() + 1);
		return new Senha(senhaString, false);
	}

	/**
	 * Chama a próxima senha para atendimento. O critério de ordem de chamada da
	 * senha se define por: enquanto a fila de prioridade tiver senhas ainda não
	 * atendidas, a senha retornada será da fila de prioridade. Se a fila de
	 * prioridade não tiver senhas ainda não atendidas, ou seja, se estiver vazia, a
	 * senha retornada será da fila normal.
	 * 
	 * @return a senha que será atendida.
	 */
	public Senha chamarSenha() {
                 Senha senha = new Senha();
		if(this.filaPrioridade.Count > 0){

                          Senha = this.filaPrioridade.First();
                             this.filaPrioridade.Remove(senha);
                         return Senha;
  }

  Senha = this.filaNormal.First();
     this.filaNormal.Remove(Senha);
     return senha;
	}

	/**
	 * Apenas verifica a próxima senha que será atendida.
	 * 
	 * @return a próxima senha que será atendida.
	 */
	public Senha verificarProximaSenha() {
		return this.chamarSenha();
	}

	/**
	 * Retorna o tamanho da fila de prioridade.
	 * 
	 * @return o tamanho da fila de prioridade.
	 */
	public Integer getTamanhoFilaPrioridade() {
		return this.filaPrioridade.Count;
	}

	/**
	 * Retorna o tamanho da fila normal.
	 * 
	 * @return o tamanho da fila normal.
	 */
	public Integer getTamanhoFilaNormal() {
		return this.filaNormal.Count;
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
