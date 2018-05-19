package clients;

import clients.entities.Client;
import clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository repository;

    @Autowired
    public void setRepository(ClientRepository repository) {
        this.repository = repository;
    }

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public Optional<Client> findClientById(Integer id) {
        return repository.findById(id);
    }
}
