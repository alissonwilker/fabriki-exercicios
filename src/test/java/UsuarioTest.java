import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.RunScript;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTest {
    protected static EntityManagerFactory emf;
    protected static EntityManager em;

    @BeforeClass
    public static void init() throws FileNotFoundException, SQLException {
        emf = Persistence.createEntityManagerFactory("FabrikiPersistenceUnit");
        em = emf.createEntityManager();
    }

    @Before
    public void setUp(){
        Session session = em.unwrap(Session.class);
        session.doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                try {
                    File script = new File(getClass().getResource("/data.sql").getFile());
                    RunScript.execute(connection, new FileReader(script));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("could not initialize with script");
                }
            }
        });
    }

    @AfterClass
    public static void tearDown(){
        em.clear();
        em.close();
        emf.close();
    }

    @Test
    public void testGetObjectById() {
        Usuario usuario = em.find(Usuario.class, 1);
        assertNotNull(usuario);
    }

    @Test
    public void testGetAll() {
        List<Usuario> books = em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();
        assertEquals(1, books.size());
    }

    @Test
    public void testPersist() {
        em.getTransaction().begin();
        em.persist(new Usuario(2, "João"));
        em.getTransaction().commit();

        List<Usuario> usuarios = em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();

        assertNotNull(usuarios);
        assertEquals(2, usuarios.size());
    }

    @Test
    public void testDelete() {
        Usuario usuario = em.find(Usuario.class, 1);

        em.getTransaction().begin();
        em.remove(usuario);
        em.getTransaction().commit();

        List<Usuario> usuarios = em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();

        assertEquals(0, usuarios.size());
    }

}
