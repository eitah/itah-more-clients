package clients;

import clients.entities.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    private ClientService clientService;

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value= "", method= RequestMethod.GET)
    public Optional<Client> getClientById(@RequestParam Integer id) {
        return clientService.findClientById(id);
    }
}