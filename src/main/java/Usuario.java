
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = { @NamedQuery(name = "Usuario.getAll", query = "SELECT u FROM Usuario u") })
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private String nome;

    public Usuario() {
    }

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario {" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
