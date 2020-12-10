package solid.single_responsibility;

public class Notification {

    public static void sendMessage(Client client){
        String message = "Client %s has been notifield";
        System.out.println(String.format(message, client.getName()));
    }
}
