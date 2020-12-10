package solid.single_responsibility;

public class SingleResponsibilityTest {

    public static void main(String[] args) {
        ClientManager clientManager = new ClientManager();

        Client client_0 = new Client(1L, "Adam");
        Client client_1 = new Client(2L, "Robert");

        clientManager.add(client_0);
        clientManager.add(client_1);

        clientManager.list().forEach(System.out::println);

        Notification.sendMessage(client_0);
        Notification.sendMessage(client_1);
    }
}
