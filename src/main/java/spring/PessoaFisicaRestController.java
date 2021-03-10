import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifb.java_web_dev.model.Contact;
import br.edu.ifb.java_web_dev.persistence.ContactRepository;

@RestController
@RequestMapping("contacts")
@CrossOrigin
public class PessoaFisicaRestController{
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping(value = "/contacts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Contact> list() {
        return contactRepository.findAll();
    }

    @GetMapping(value = "/contacts/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<Contact> getContact(@PathVariable Integer id) {
        return contactRepository.findById(id);
    }

    @PostMapping(path = "/contacts", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Contact addContact(@RequestBody Contact contato) {
        return persistirContact(contato);
    }

    @PutMapping(path = "/contacts/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Contact updateContact(@PathVariable Integer id, @RequestBody Contact contato) {
        return persistirContact(contato);
    }

    private Contact persistirContact(Contact contato) {
        Contact c = contato;
        if (contato.getId() != null) {
            c = contactRepository.findById(contato.getId()).get();
            c.setName(contato.getName());
        }
        return contactRepository.save(c);
    }

    @DeleteMapping(value = "/contacts/{id}", method = RequestMethod.DELETE)
    public void deleteContact(@PathVariable Integer id) {
        contactRepository.deleteById(id);
    }

}
