package spring;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = WebEnvironment.MOCK,
    classes = {JavaWebDevApplication.class}
)
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class PessoaFisicaRestControllerTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private PessoaFisicaRepository pfRepository;
    @Autowired
    private ContaBancariaRepository cbRepository;

    public PessoaFisicaRestControllerTest() {
        throw new Error("Unresolved compilation problems: \n\tPessoaFisicaRepository cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n\tPessoaFisica cannot be resolved\n\tPessoaFisica cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n\tPessoaFisica cannot be resolved\n\tPessoaFisica cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tPessoaFisica cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n");
    }

    @Before
    public void resetDb() {
        throw new Error("Unresolved compilation problem: \n\tPessoaFisicaRepository cannot be resolved to a type\n");
    }

    @Test
    public void testAddPessoaFisica() throws IOException, Exception {
        throw new Error("Unresolved compilation problems: \n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n\tPessoaFisica cannot be resolved\n");
    }

    @Test
    public void testUpdatePessoaFisica() throws IOException, Exception {
        throw new Error("Unresolved compilation problems: \n\tPessoaFisica cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n\tPessoaFisica cannot be resolved\n");
    }

    @Test
    public void testDeletePessoaFisica() throws IOException, Exception {
        throw new Error("Unresolved compilation problems: \n\tPessoaFisica cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n");
    }

    @Test
    public void testGetPessoasFisicas() throws Exception {
        throw new Error("Unresolved compilation problems: \n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n");
    }

    @Test
    public void testGetPessoaFisica() throws Exception {
        throw new Error("Unresolved compilation problems: \n\tPessoaFisica cannot be resolved to a type\n\tThe method createTestPessoaFisica(String, String) from the type PessoaFisicaRestControllerTest refers to the missing type PessoaFisica\n");
    }

    private PessoaFisica createTestPessoaFisica(String nome, String cpf) {
        throw new Error("Unresolved compilation problems: \n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisica cannot be resolved to a type\n\tPessoaFisicaRepository cannot be resolved to a type\n");
    }
}
