package spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private String cpf;
		private String nome;

		
		public PessoaFisica() {}


		public PessoaFisica(String nome, String cpf) {
			this.nome = nome;
			this.cpf = cpf;
		}
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
}
