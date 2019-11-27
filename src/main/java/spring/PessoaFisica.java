package spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class PessoaFisica extends Cliente {
	String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	  @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id, String nome,String cpf,
	            @RequestBody PessoaFisica pessoaFisica) {
		  return persistirPessoaFisica(pessoaFisica);
	    }
	  
	
	}
	
