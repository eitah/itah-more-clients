package clients;

import clients.entities.Client;
import clients.entities.Name;
import com.sun.deploy.util.SessionState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    private ClientService clientService;

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value= "", method= RequestMethod.GET)
    public ResponseEntity getClientById(@RequestParam Integer id) {
        Optional<Client> client = clientService.findClientById(id);
        if (client.isPresent()) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value="", method= RequestMethod.POST)
    public Client saveClient(@RequestBody Client clientRequest) {
        return clientService.saveClient(clientRequest);
    }
}