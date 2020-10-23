package spring;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoaFisica")


public class PessoaFisica {
	
	    @Id  // coluna id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;  //chave primária
	    
	    @Column(updatable = true, nullable = false, unique = true)
	    private String name;  //

	    public PessoaFisica() {
	        
	    }

	    public PessoaFisica(String name) {
	        this.name = name;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        boolean result = false;

	        if (obj instanceof PessoaFisica) {
	            PessoaFisica c = (PessoaFisica) obj;
	            result = c.getId() == this.getId();
	        }

	        return result;
	    }

	    @Override
	    public int hashCode() {
	        return getId() ^ 7;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }   
	}
