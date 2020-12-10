package solid.single_responsibility;

import java.util.ArrayList;
import java.util.List;

public class ClientManager {

    private List<Client> clients;

    public ClientManager() {
        this.clients = new ArrayList<>();
    }

    public void add(Client client) {
        this.clients.add(client);
    }

    public List<Client> list() {
        return clients;
    }

    public void update(Client updatedClient) {
        Client client = this.clients.stream()
                .filter(c -> c.getGovernmentId().equals(updatedClient.getGovernmentId()))
                .findFirst()
                .orElseThrow(NoSuchFieldError::new);

        int index = clients.indexOf(updatedClient);
        clients.set(index, client);
    }

    public void delete(Long governmentId){
        Client client = this.clients.stream()
                .filter(c -> c.getGovernmentId().equals(governmentId))
                .findFirst()
                .orElseThrow(NoSuchFieldError::new);

        this.clients.remove(client);
    }

}
