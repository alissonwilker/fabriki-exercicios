public class PessoaFisica extends Cliente {

		private String Cpf;


		public PessoaFisica(String Nome, String Cpf) {
			super(Nome);
			this.Cpf=Cpf;
		}

		public String getCpf() {
			return Cpf;
		}


}
